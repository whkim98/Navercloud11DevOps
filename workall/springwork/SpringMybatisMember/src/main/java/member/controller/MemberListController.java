package member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberListController {

	@GetMapping("/list")
	public String list() {
		return "member/memberlist";
	}
	
}
