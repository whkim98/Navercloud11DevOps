package com.bitcamp.study;


import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import data.dto.ShopDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		model.addAttribute("msg", "Hello");
		model.addAttribute("today", new Date());
		
		ShopDto dto = new ShopDto();
		dto.setSang("머리띠");
		dto.setPhoto("30.jpg");
		dto.setPrice(13000);
		dto.setSu(3);
		
		ShopDto dto2 = new ShopDto("머리끈", "26.jpg", 9000, 5);
		
		model.addAttribute("dto", dto);
		model.addAttribute("dto2", dto2);
		
		System.out.println(dto);
		
		return "home";
	}
	
}
