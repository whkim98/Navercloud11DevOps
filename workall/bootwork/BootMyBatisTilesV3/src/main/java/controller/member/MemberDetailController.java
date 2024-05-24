package controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import data.dto.MemberDto;
import data.service.MemberService;

@Controller
public class MemberDetailController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/member/detail")
	public String detail(int num, Model model)
	{
		
		MemberDto dto=memberService.getData(num);
		model.addAttribute("dto", dto);
		return "member/detailpage";
	}
	
}
