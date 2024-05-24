package controller.member;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import data.dto.MemberDto;
import data.service.MemberService;

@Controller
public class MemberFormController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/member/form")
	public String form()
	{
		return "member/memberform";
	}
	
	@ResponseBody  //json 으로 반환
	@GetMapping("/member/idcheck")
	public Map<String, Integer> getIdCheck(
			@RequestParam String searchid)
	{
		Map<String, Integer> map=new HashMap<>();
		int count=memberService.getIdCheckCount(searchid);
		map.put("count", count);
		return map;
	}
	
	@PostMapping("/member/insert")
	public String saveData(@ModelAttribute MemberDto dto, @RequestParam("myfile") MultipartFile myfile,
			HttpServletRequest request) {
		
		String savePath = request.getSession().getServletContext().getRealPath("/save");
		String ext = myfile.getOriginalFilename().split("\\.")[1];
		String photo = UUID.randomUUID()+"."+ext;
		dto.setPhoto(photo);
		try {
			myfile.transferTo(new File(savePath+"/"+photo));
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		memberService.insertMember(dto);
		return "redirect:./list";
	}
}