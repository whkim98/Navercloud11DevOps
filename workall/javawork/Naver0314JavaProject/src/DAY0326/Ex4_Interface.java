package DAY0326;

//인터페이스는 음식점의 메뉴판과 같다.
//구현 가능한 목록을 나열만 하고 실체(body)가 없기 때문이다.
//상수와 추상메서드로만 구성이 되어있다.(final과 abstract 생략 가능)
interface InterA{
	int MAX = 10;
	public void disp();
	public void study();
}

class MyInter implements InterA{

	@Override
	public void disp() {
		System.out.println("현재 최대 인원수는 " + MAX + "명입니다.");
	}

	@Override
	public void study() {
		System.out.println("인터페이스 공부 중");
	}
	
	public void play() {
		System.out.println("게임을 시작합니다");
	}
	
}

public class Ex4_Interface {
	
	public static void main(String[] args) {
		
		InterA in = new MyInter();
		in.disp();
		in.study();
//		in.play(); //오버라이드 하지 않은 메소드는 호출되지 않음
		
		System.out.println("=".repeat(30));
		
		MyInter mi = new MyInter();
		mi.play();
		
		System.out.println("=".repeat(30));
		
		((MyInter)in).play();
//		(MyInter)in.play();
	}

}
