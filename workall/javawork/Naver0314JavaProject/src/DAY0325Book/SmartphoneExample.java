package DAY0325Book;

public class SmartphoneExample {
	
	public static void main(String[] args) {
		
		Smartphone myPhone = new Smartphone("갤럭시", "은색");
		
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		
		System.out.println("와이파이상태: " + myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("엽ㅎ세요");
		myPhone.receiveVoice("안녕하세요! 저는 김우형입니다.");
		myPhone.sendVoice("반가우어ㅛ");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();
		
	}

}
