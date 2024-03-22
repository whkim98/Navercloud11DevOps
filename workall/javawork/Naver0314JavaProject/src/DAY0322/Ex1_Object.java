package DAY0322;

class Apple{
	String msg = "Happy Day!!"; //인스턴스 멤버변수
	static String message = "오늘은 금요일"; //static 멤버변수
}

class Banana{
	static int kor = 100;
	static int eng = 80;
	String name = "마이클";
	
	public int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
}

public class Ex1_Object {
	
	//멤버변수
	String name = "홍길동"; //인스턴스 변수
	final static int MAX = 100; //static 변수
	
	public static void main(String[] args) {
		
		/*
		 * static 멤버 메서드는 static 멤버 변수나 멤버 메서드만
		 * 접근이 가능함
		 * 일반 인스턴스 메서드나 변수를 접근하기 위해서는 new로 생성 후
		 * 그 변수를 이용해서 호출해야 함
		 */
		
		//System.out.println(name);//오류
		
		System.out.println(Ex1_Object.MAX);
		System.out.println(MAX);
		
		//name 출력(ex라는 인스턴스변수 생성 후 출력)
		Ex1_Object ex = new Ex1_Object();
		System.out.println(ex.name); 
		
		Apple ap = new Apple();
		System.out.println(ap.msg);
		System.out.println(Apple.message);
		
		Banana ba = new Banana();
		System.out.println(ba.sum(Banana.kor, Banana.eng));
		System.out.println(ba.name);
		
	}

}
