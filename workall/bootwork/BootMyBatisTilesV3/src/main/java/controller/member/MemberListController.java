package controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberListController {

	@GetMapping({"/", "member/list"})
	public String memberList() {
		return "member/memberlist";
	}
	
}
