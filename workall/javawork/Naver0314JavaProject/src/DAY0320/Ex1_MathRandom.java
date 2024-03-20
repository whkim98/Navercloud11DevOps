package DAY0320;

public class Ex1_MathRandom {
	
	public static void main(String[] args) {
		
		System.out.println("** Math.random() 을 이용한 난수 구허기 **");
		System.out.println("1. random()시 값");
		for(int i = 1; i <= 5; i++) {
			double d = Math.random(); //0.0보다 크거나 같고 1.0보다 작은 난수 발생
			System.out.println(d);
		}
		
		System.out.println("=".repeat(35));
		
		System.out.println("2. 0 ~ 9 발생");
		for(int i = 1; i <= 5; i++) {
			int n = (int)(Math.random() * 10);
			System.out.println(n);
		}
		
		System.out.println("=".repeat(35));
		
		System.out.println("3. 1 ~ 10 발생");
		for(int i = 1; i <= 5; i++) {
			int n = (int)(Math.random() * 10) + 1;
			System.out.println(n);
		}
		
		System.out.println("=".repeat(35));
		
		System.out.println("4. 1 ~ 100 발생");
		for(int i = 1; i <= 5; i++) {
			int n = (int)(Math.random() * 100) + 1;
			System.out.println(n);
		}
		
		System.out.println("=".repeat(35));
		
		System.out.println("5. A ~ Z 발생");
		for(int i = 1; i <= 5; i++) {
			int n = (int)(Math.random() * 26) + 65;
			System.out.println((char)n);
		}
		
		System.out.println("=".repeat(35));
		
		System.out.println("6. a ~ z 발생");
		for(int i = 1; i <= 5; i++) {
			int n = (int)(Math.random() * 26) + 97;
			System.out.println((char)n);
		}
		
	}

}
