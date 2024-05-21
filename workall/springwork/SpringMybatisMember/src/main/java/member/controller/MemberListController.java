package member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import member.service.MemberService;

@Controller
@RequestMapping("/member")  
public class MemberListController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/list")
	public String list(Model model){
		int totalCount;
		
		totalCount=memberService.getTotalCount();
		model.addAttribute("totalCount", totalCount);
		
		return "member/memberlist";
	}

}