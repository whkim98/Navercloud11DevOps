package com.bitcamp.study;

import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import data.dto.ShopDto;

@Controller
public class HomeController {
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		ShopDto dto1=new ShopDto();
//		dto1.setSang("머리띠");
//		dto1.setPhoto("30.jpg");
//		dto1.setPrice(13000);
//		dto1.setSu(3);
//		
//		ShopDto dto2=new ShopDto("머리끈", "26.jpg", 9000, 5);
//		
//		model.addAttribute("dto1", dto1);
//		model.addAttribute("dto2", dto2);
//		
//		System.out.println(dto1.toString());
//		System.out.println(dto2);//toString 생략가능
//		
//		model.addAttribute("msg","Hello SpringFramework!!!");
//		model.addAttribute("today", new Date());
//		return "home";//포워드
//	}
	@GetMapping("/")
	public String hello(Model model) {
		return "start";
	}
	
	@GetMapping("/board/list")
	public String hello2(Model model) {
		model.addAttribute("msg", "ㅎㅇㅎㅇ");
		return "result1";
	}
	
	@GetMapping("/guest/list")
	public ModelAndView hello3() {
		ModelAndView mview = new ModelAndView();
		mview.addObject("today", new Date());
		mview.setViewName("result2");
		return mview;
	}
	
}