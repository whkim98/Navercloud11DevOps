package DAY0328;

/*
 * 자바에서의 함수형 프로그램인 람다 표현식은 인터페이스를 사용하는 익명내부 클래스의 또 다른 표현식이다
 * 단, 인터페이스는 단 하나의 추상 메소드만 가지고 있어야 한다
 */

@FunctionalInterface //메소드가 하나인지 검증
interface Orange{
	public void write();
}

@FunctionalInterface
interface DataAdd{
	public void add(int x, int y);
}

public class Ex2_Lambda {
	
	Orange o = new Orange() {
		
		@Override
		public void write() {
			System.out.println("오렌지");
		}
	};
	
	public void lambdaMethod() {
		Orange o2 = ()->System.out.println("람다식 오렌지");
		o2.write();
		
		Orange o3 = ()->{
			System.out.println("두줄짜리");
			System.out.println("람다");
		};
		o3.write();
	}
	
	public void lambdaMethod2() {
		DataAdd add1 = (int x, int y)->System.out.println("두 수의 합: " + (x + y));
		add1.add(10, 20);
	}
	
	public static void main(String[] args) {
		
		Ex2_Lambda ex = new Ex2_Lambda();
		ex.o.write();
		ex.lambdaMethod();
	
		ex.lambdaMethod2();
		
	}

}
