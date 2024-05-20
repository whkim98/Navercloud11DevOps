package day0520.uploadcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UploadMultiController {
	
	@GetMapping("/uploadform2")
	public String upload2() {
		return "upload/uploadform2";
	}

}
