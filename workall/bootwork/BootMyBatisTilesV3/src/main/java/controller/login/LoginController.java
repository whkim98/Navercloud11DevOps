package controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import data.service.MemberService;

@Controller
public class LoginController {
	
	@Autowired
	private MemberService memberService;

}
