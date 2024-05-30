package controller.board;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import data.dto.ReBoardDto;
import data.service.ReBoardService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import naver.cloud.NcpObjectStorageService;

@Controller
@RequiredArgsConstructor
public class BoardUpdateController {
	
	@NonNull
	private ReBoardService boardService;
	
	private String bucketName = "bitcamp-bucket-56";
	private String folderName = "photocommon";
	
	@Autowired
	private NcpObjectStorageService storageService;
	
	@GetMapping("/board/updateform")
	public String updateForm(
			@RequestParam int num,
			@RequestParam int currentPage,
			Model model
			)
	{
		model.addAttribute("currentPage", currentPage);
		//dto 얻기
		ReBoardDto dto=boardService.getData(num);
		model.addAttribute("dto", dto);
		
		return "board/updateform";
	}
	
	@PostMapping("/board/update")
	public String update(@ModelAttribute ReBoardDto dto,
			@RequestParam("upload") MultipartFile upload,
			@RequestParam int currentPage,
			HttpServletRequest request)
	{
//		String saveFolder = request.getSession().getServletContext().getRealPath("/save");
//		String uploadphoto = null;
//		if(!upload.getOriginalFilename().equals("")) {
//			String ext = upload.getOriginalFilename().split("\\.")[1];
//			uploadphoto = UUID.randomUUID()+"."+ext;
//			try {
//				upload.transferTo(new File(saveFolder + "/" + uploadphoto));
//			} catch (IllegalStateException | IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		String uploadphoto = storageService.uploadFile(bucketName, folderName, upload);
		dto.setUploadphoto(uploadphoto);
		boardService.updateReboard(dto);
		return "redirect:./detail?num="+dto.getNum()+"&currentPage="+currentPage;
	}
	
	
}