package DAY0326;

class OuterClass{
	int a = 10;
	static int b = 20;
	
	class InnerClass{
		int c = 30;
		static int d = 40; //JDK17부터 내부클래스에 static 변수 가능
		
		public void show() {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			System.out.println("d = " + d);
		}
	}
	
	//정적내부클래스
	static class InnerClass2{
		int e = 50;
		static int f = 60;
		public void show() {
//			System.out.println("a = " + a); //static 클래스는 외부클래스에 있는 인스턴스 변수에 접근 불가능
			System.out.println("b = " + b);
			System.out.println("e = " + e);
			System.out.println("f = " + f);
		}
	}
	
	public void disp() {
		//내부클래스가 가진 show 메서드 호출
		InnerClass in = new InnerClass();
		in.show();
		InnerClass2 in2 = new InnerClass2();
		in2.show();
	}
	
}

public class Ex8_InnerClass {
	
	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		outer.disp();
		
	}

}
