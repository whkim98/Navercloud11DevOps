package controller.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import data.service.MemberService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Controller
public class MemberDeleteController {
	
	@Autowired
	private MemberService memberService;
	
	@ResponseBody
	@GetMapping("/member/delete")
	public Map<String, String> delete(int num, String passwd){
		Map<String, String> map = new HashMap<String, String>();
		int n = memberService.isEqualPassCheck(num, passwd);
		
		System.out.println(n);
		if(n == 1) {
			memberService.deleteMember(num);
		}
		map.put("status", n == 1 ? "success":"fail");
		return map;
	}

}
