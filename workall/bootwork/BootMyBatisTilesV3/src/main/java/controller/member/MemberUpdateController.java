package controller.member;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import data.dto.MemberDto;
import data.service.MemberService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberUpdateController {

	@NonNull
	private MemberService memberService;

	@ResponseBody
	@PostMapping("/upload")
	public Map<String,String> uploadPhoto(
			@RequestParam("upload") MultipartFile upload,
			@RequestParam int num,
			HttpServletRequest request
			)
	{
		String savePath=request.getSession().getServletContext().getRealPath("/save");
		//업로드한 파일의 확장자 분리
		String ext=upload.getOriginalFilename().split("\\.")[1];
		//업로드할 파일명
		String photo=UUID.randomUUID()+"."+ext;
		
		//실제 업로드
		try {
			upload.transferTo(new File(savePath+"/"+photo));
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//db 에서 photo 수정
		memberService.updatePhoto(num, photo);
		
		Map<String,String> map=new HashMap<>();
		map.put("photoname", photo);
		System.out.println(photo);
		return map;
	}
	
	@GetMapping("/updateform")
	public String update(int num, Model model) {
		MemberDto dto = memberService.getData(num);
		model.addAttribute("dto", dto);
		return "member/updateform";
	}
	
	@PostMapping("update")
	public String updateData(int num, String name, String hp, String email, String addr, String birthday) {
		memberService.updateData(num, name, hp, email, addr, birthday);
		return "redirect:./detail?num="+num;
	}
}