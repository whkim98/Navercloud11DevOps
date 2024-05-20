package day0520.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Form1WriteController {

	@GetMapping("/read1")
	public String read1(@RequestParam("name") String name, @RequestParam("addr") String addr, @RequestParam("age") int age, Model model) {
		
		return "form1/result1";
	}
	
}
