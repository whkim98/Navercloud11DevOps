package day0520.uploadcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UploadOneController {
	
	@GetMapping("/uploadform1")
	public String upload1() {
		return "upload/uploadform1";
	}

}
