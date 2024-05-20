package day0520.uploadcontroller;

import java.util.List;

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
		
		
		return "upload/resultphoto2";
	}

}
