package controller.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import data.dto.ReBoardDto;
import data.service.MemberService;
import data.service.ReBoardService;

@Controller
public class BoardDetailDeleteController {
	
	@Autowired
	private ReBoardService boardService;
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/board/detail")
	public String detail(@RequestParam int num, @RequestParam int currentPage, Model model) {
		
		boardService.updateReadCount(num);
		
		ReBoardDto dto = boardService.getData(num);
		
		String profile_photo = memberService.getDataById(dto.getMyid()).getPhoto();
		
		model.addAttribute("dto", dto);
		model.addAttribute("profile_photo", profile_photo);
		model.addAttribute("currentPage", currentPage);
		
		return "board/detailpage";
	}

}
