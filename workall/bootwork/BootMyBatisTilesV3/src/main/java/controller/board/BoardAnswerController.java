package controller.board;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import data.dto.BoardAnswerDto;
import data.service.BoardAnswerService;
import data.service.MemberService;

@RestController
public class BoardAnswerController {

	@Autowired
	private BoardAnswerService answerService;
	
	@Autowired
	private MemberService memberService;
	
	@PostMapping("/ainsert")
	public void insertAnswer(@RequestParam int num,
			@RequestParam String content,
			HttpSession session) {
		
		String myid = (String) session.getAttribute("loginid");
		String writer = memberService.getDataById(myid).getName();
		
		BoardAnswerDto dto = BoardAnswerDto.builder()
				.myid(myid)
				.writer(writer)
				.content(content)
				.num(num).build();
		
		answerService.insertAnswer(dto);
		
	}
	
}
