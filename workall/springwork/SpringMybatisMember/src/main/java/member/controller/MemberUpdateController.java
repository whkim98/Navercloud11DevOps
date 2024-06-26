package member.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import member.dto.MemberDto;
import member.service.MemberService;

@Controller
public class MemberUpdateController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/member/updateform")
	public String updateForm(int num, Model model) {
		model.addAttribute("num", num);
		MemberDto dto = memberService.getData(num);
		model.addAttribute("dto", dto);
		return "member/updateform";
	}
	
	@PostMapping("/member/update")
	public String update(int num, String name, String hp, String email, String addr, String birthday) {
		MemberDto dto = new MemberDto();
		dto.setAddr(addr);
		dto.setBirthday(birthday);
		dto.setEmail(email);
		dto.setHp(hp);
		dto.setName(name);
		dto.setNum(num);
		System.out.println("name:" + name);
		System.out.println("num:" + num);
		memberService.updateMember(dto);
		System.out.println("dto: " + dto);
		return "redirect:/member/detail?num="+num;
	}
	
	@ResponseBody
	@GetMapping("/member/delete")
	public Map<String, String> delete(@RequestParam int num, @RequestParam String passwd){
		Map<String, String> map = new HashMap<String, String>();
		boolean b = memberService.isEqualPassCheck(num, passwd);
		if(b) {
			memberService.deleteMember(num);
		}
		map.put("status", b ? "success":"fail");
		return map;
	}

}
