package anno.study.ex4;

import org.springframework.stereotype.Component;

@Component //클래스 이름이 아이디가 됨(첫글자 소문자로 변경)
public class Hello {
	
	public void showMessage() {
		System.out.println("Hello Class가 가진 메소드");
	}

}
