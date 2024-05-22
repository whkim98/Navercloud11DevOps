package member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import member.dto.MemberDto;
import member.service.MemberService;

@Controller
@RequestMapping("/member")  
@RequiredArgsConstructor
public class MemberDetailController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/detail")
	public String detail(Model model, int num) {
		MemberDto dto = memberService.selectDetail(num);
		model.addAttribute("dto", dto);
		return "member/memberDetail";
	}
	
}
