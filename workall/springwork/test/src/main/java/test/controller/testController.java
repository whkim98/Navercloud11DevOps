package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {

	@GetMapping("/test/topscore")
    public String topScorere() {
    	return "/test/score";
    }
	
}
