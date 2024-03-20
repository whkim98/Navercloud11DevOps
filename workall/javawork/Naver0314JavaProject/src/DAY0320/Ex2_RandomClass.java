package DAY0320;

import java.util.Random;

public class Ex2_RandomClass {
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		System.out.println("** Random 클래스를 이용한 난수 구하기 **");
		
		System.out.println("1. 0 ~ 9 난수 구하기");
		for(int i = 1; i <= 5; i++) {
			int n = ran.nextInt(10);
			System.out.println(n);
		}
		
		System.out.println("=".repeat(35));
		
		System.out.println("2. 1 ~ 10 난수 구하기");
		for(int i = 1; i <= 5; i++) {
			int n = ran.nextInt(10) + 1;
			System.out.println(n);
		}
		
		System.out.println("=".repeat(35));
		
		System.out.println("3. 1 ~ 100 난수 구하기");
		for(int i = 1; i <= 5; i++) {
			int n = ran.nextInt(100) + 1;
			System.out.println(n);
		}
		
		System.out.println("=".repeat(35));
		
		System.out.println("4. A ~ Z 난수 구하기");
		for(int i = 1; i <= 5; i++) {
			int n = ran.nextInt(26) + 65;
			System.out.println((char)n);
		}
		
		System.out.println("=".repeat(35));
		
		System.out.println("5. a ~ z 난수 구하기");
		for(int i = 1; i <= 5; i++) {
			int n = ran.nextInt(26) + 97;
			System.out.println((char)n);
		}
		
		System.out.println("=".repeat(35));
		
	}

}
