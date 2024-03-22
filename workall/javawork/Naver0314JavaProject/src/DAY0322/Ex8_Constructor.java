package DAY0322;

/*
 * 생성자의 특징
 * 1. 클래스명과 동일한 메서드명으로 만들어야 함
 * 2. 리턴 타입이 없음
 * 3. overloading이 가능함(여러 개 생성 가능)
 * 4. 생성할 때 한 번 호출됨
 * 5. 멤버변수의 초기화를 담당함
 */
class Kiwi{
	
	String name;
	String addr;
	
	public Kiwi(){
		System.out.println("디폴트 생성자");
		name = "이미자";
		addr = "서울";
	}
	
	public Kiwi(String name){
		this.name = name;
	}
	
	public Kiwi(String name, String addr){
		this.name = name;
		this.addr = addr;
	}
	
	public void show() {
		System.out.println(name + "님은 " + addr + "에 살고 있어요");
	}
}

public class Ex8_Constructor {
	
	public static void main(String[] args) {
		
		Kiwi k1 = new Kiwi();
		k1.show();
		
		Kiwi k2 = new Kiwi("강호동");
		k2.show();
		
		Kiwi k3 = new Kiwi("영숙이", "부산");
		k3.show();
	}

}
