package day0520.uploadcontroller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadMultiController {
	
	@GetMapping("/uploadform2")
	public String upload2() {
		return "upload/uploadform2";
	}
	
	@PostMapping("/upload2")
	public String uploadResult(@RequestParam String title, @RequestParam("upload") List<MultipartFile> upload, HttpServletRequest request, Model model) {
		String realFolder=request.getSession().getServletContext().getRealPath("/resources/upload");
		System.out.println(realFolder);//콘솔로 출력후 탐색기를 열어서 이미지를 확인해주세요
		
		int len = upload.size();
		model.addAttribute("len", len);
		model.addAttribute("title", title);
		List<String> photolist = new Vector<String>();
		for(MultipartFile multi : upload) {
			String photo = UUID.randomUUID() + ".jpg";
			try {
				multi.transferTo(new File(realFolder+"/"+photo));
				photolist.add(photo);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}
		model.addAttribute("photolist", photolist);
		
		return "upload/resultphoto2";
	}

}
