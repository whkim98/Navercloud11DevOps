package controller.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String saveData() {
		return "redirect:./list";
	}
}