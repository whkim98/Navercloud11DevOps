package controller.guest;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import data.dto.GuestDto;
import data.dto.GuestPhotoDto;
import data.service.GuestService;
import data.service.MemberService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import naver.cloud.NcpObjectStorageService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/guest")
public class GuestAjaxController {
	
	@NonNull
	private GuestService guestService;
	@NonNull
	private MemberService memberService;
	@NonNull
	private NcpObjectStorageService storageService;
	
	private String bucketName = "bitcamp-bucket-56";
	private String folderName = "guestphoto";
	
	@PostMapping("/addguest")
	public void guestInsert(@RequestParam String gcontent, @RequestParam("upload") List<MultipartFile> upload,
			HttpSession session) {
		
		String myid = (String) session.getAttribute("loginid");
		String writer = memberService.getDataById(myid).getName();
		
		GuestDto dto = GuestDto.builder()
				.writer(writer)
				.myid(myid)
				.gcontent(gcontent)
				.build();
		
		guestService.insertGuest(dto);
		int guestidx = dto.getGuestidx();
//		if(upload.get(0).getOriginalFilename().equals("")) {
//			return;
//		}
		if(upload == null) {
			return;
		}
		for(MultipartFile mfile: upload) {
			String photoname = storageService.uploadFile(bucketName, folderName, mfile);
			GuestPhotoDto pdto = new GuestPhotoDto();
			pdto.setGuestidx(guestidx);
			pdto.setPhotoname(photoname);
			guestService.insertGuestPhoto(pdto);
		}
	}

}
