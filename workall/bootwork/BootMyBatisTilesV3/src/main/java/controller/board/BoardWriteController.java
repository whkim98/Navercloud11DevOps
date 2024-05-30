package controller.board;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import data.dto.ReBoardDto;
import data.service.MemberService;
import data.service.ReBoardService;
import naver.cloud.NcpObjectStorageService;

@Controller
public class BoardWriteController {

	@Autowired
	private ReBoardService boardService;
	
	@Autowired
	private MemberService memberService;
	
	private String bucketName = "bitcamp-bucket-56";
	private String folderName = "photocommon";
	
	@Autowired
	private NcpObjectStorageService storageService;
	
	@GetMapping("/board/form")
	public String form(@RequestParam(defaultValue = "0") int num,
			@RequestParam(defaultValue = "0") int regroup,
			@RequestParam(defaultValue = "0") int restep,
			@RequestParam(defaultValue = "0") int relevel,
			@RequestParam(defaultValue = "1") int currentPage,
			Model model) {
		
		String subject = "";
		if(num > 0) {
			subject = "[답글]" + boardService.getData(num).getSubject();
		}
		
		model.addAttribute("subject", subject);
		model.addAttribute("num", num);
		model.addAttribute("regroup", regroup);
		model.addAttribute("restep", restep);
		model.addAttribute("relevel", relevel);
		model.addAttribute("currentPage", currentPage);
		
		return "board/writeform";
	}
	
	@PostMapping("/board/insert")
	public String insert(@ModelAttribute ReBoardDto dto, @RequestParam("upload") MultipartFile upload, 
			@RequestParam int currentPage, HttpServletRequest request, HttpSession session) {
		
//		String saveFolder = request.getSession().getServletContext().getRealPath("/save");
//		
//		String photo = upload.getOriginalFilename();
//		if(photo.equals("")) {
//			photo = "no";
//		}else {
//			String ext = photo.split("\\.")[1];
//			photo = UUID.randomUUID() + "." + ext;
//			
//			try {
//				upload.transferTo(new File(saveFolder + "/" + photo));
//			} catch (IllegalStateException | IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		String photo = storageService.uploadFile(bucketName, folderName, upload);
		
		dto.setUploadphoto(photo);
		
		String loginid = (String) session.getAttribute("loginid");
		dto.setMyid(loginid);
		
		String writer = memberService.getDataById(loginid).getName();
		dto.setWriter(writer);
		
		boardService.insertBoard(dto);
		
		System.out.println("num: " + dto.getNum());
		
		
//		return "redirect:./list?currentPage=" + currentPage;
		return "redirect:./detail?num=" + dto.getNum() + "&currentPage=" + currentPage;
	}
	
}
