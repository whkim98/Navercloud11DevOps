package member.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import member.dto.MemberDto;
import member.service.MemberService;

@Controller
@RequiredArgsConstructor
public class MemberDetailController {
	
	@NonNull
	private MemberService memberService;
	
	@GetMapping("/member/detail")
	public String detail(@RequestParam int num,Model model)
	{
		MemberDto dto=memberService.getData(num);
		model.addAttribute("dto", dto);
		return "member/detailpage";
	}
	
	@ResponseBody
	@PostMapping("/member/upload")
	public Map<String, String> uploadPhoto(
			@RequestParam("upload") MultipartFile upload,
			@RequestParam int num,
			HttpServletRequest request
			)
	{
		Map<String, String> map=new HashMap<String, String>();
		System.out.println("num="+num);
		
		map.put("photoname", upload.getOriginalFilename());
		return map;
	}
}