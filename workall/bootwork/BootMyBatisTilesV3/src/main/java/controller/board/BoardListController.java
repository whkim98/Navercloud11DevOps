package controller.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import data.dto.ReBoardDto;
import data.service.ReBoardService;

@Controller
public class BoardListController {
	
	@Autowired
	private ReBoardService boardService;
	
	@GetMapping("/board/list")
	public String list(@RequestParam(defaultValue = "1") int currentPage,
			Model model) {
		
		int totalCount = boardService.getTotalCount();
		int perPage = 5;
		int perBlock = 3;
		
		int start;
		int startPage;
		int totalPage;
		int endPage;
		int no;
		
		totalPage = totalCount / perPage + (totalCount % perPage > 0 ? 1 : 0);
		
		startPage = (currentPage - 1) / perBlock * perBlock + 1;
		endPage = startPage + perBlock - 1;
		if(endPage > totalPage) {
			endPage = totalPage;
		}
		
		start = (currentPage - 1) * perPage;
		
		no = totalCount - (currentPage - 1) * perPage;
		
		List<ReBoardDto> list = boardService.getPagingList(start, perPage);
		
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("list", list);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("no", no);
		
		return "board/boardlist";
	}

}
