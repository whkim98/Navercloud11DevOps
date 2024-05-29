package controller.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@PostMapping("/board/ainsert")
	public void insertAnswer(@RequestParam int num,
			@RequestParam String content,
			HttpSession session) {
		
		String myid = (String) session.getAttribute("loginid");
		String writer = memberService.getDataById(myid).getName();
		System.out.println(content);
		BoardAnswerDto dto = BoardAnswerDto.builder()
				.myid(myid)
				.writer(writer)
				.content(content)
				.num(num).build();
		
		System.out.println(myid);
		System.out.println(writer);
		System.out.println(num);
		answerService.insertAnswer(dto);
		
	}
	
	@GetMapping("/board/alist")
	public List<BoardAnswerDto> alist(int num){
		return answerService.getAnswerData(num);
	}
	
}
