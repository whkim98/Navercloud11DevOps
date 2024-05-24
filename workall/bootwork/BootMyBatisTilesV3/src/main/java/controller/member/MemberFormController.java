package controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberFormController {
	@GetMapping("/member/form")
	public String form()
	{
		return "member/memberform";
	}
}