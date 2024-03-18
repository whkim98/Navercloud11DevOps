package DAY0318;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
//		System.out.println("지수승 구하기");
//		System.out.println("3^3 = " + Math.pow(3, 3));
//		System.out.println("2^4 = " + Math.pow(2, 4));
		
		/*
		 * x와 y를 입력 후 x의 y승값을 구하시오
		 * 
		 * 예)
		 * x? 3
		 * y? 4
		 * 3의 4승은 81입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int sum = 1;
		
		System.out.println("x?");
		x = sc.nextInt();
		
		System.out.println("y?");
		y = sc.nextInt();
		
		for(int i = 1; i <= y; i++) {
			sum *= x;
		}
		
		System.out.println(x + "의 " + y + "승은 " + sum + "입니다");
		
		sc.close();
		
	}
	
}
