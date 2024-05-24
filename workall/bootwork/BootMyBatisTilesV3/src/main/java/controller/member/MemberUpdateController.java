package controller.member;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import data.service.MemberService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberUpdateController {
	
	@NonNull
	private MemberService memberService;
	
	@PostMapping("/upload")
	public Map<String, String> uploadPhoto(@RequestParam("upload") MultipartFile upload, @RequestParam int num, HttpServletRequest request){
		
		String savePath = request.getSession().getServletContext().getRealPath("/save");
		String ext = upload.getOriginalFilename().split("\\.")[1];
		String photo = UUID.randomUUID()+"."+ext;
		try {
			upload.transferTo(new File(savePath+"/"+photo));
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<String, String> map = new HashMap<>();
		map.put("photoname", photo);
		
		memberService.updatePhoto(num, photo);
		
		return map;
	}

}
