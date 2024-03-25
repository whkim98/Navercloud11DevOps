package DAY0325;

class Parent2{
	public void job() {
		System.out.println("부모클래스에서 해야 할 일 처리");
	}
}

class Sub2 extends Parent2{
	
	@Override
	public void job() {
		super.job(); //같은 이름의 메서드가 현재 클래스에 존재(오버라이드)하므로 부모가 가진 메서드 호출시 반드시 super로 호출
		System.out.println("자식 클래스에서 처리해야 할 일");
	}
	
}

public class Ex5_Override {
	
	public static void main(String[] args) {
		
		Sub2 s = new Sub2();
		s.job();
		
	}

}
