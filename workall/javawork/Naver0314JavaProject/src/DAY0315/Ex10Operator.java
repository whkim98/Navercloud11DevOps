package DAY0315;

import java.util.Scanner;

public class Ex10Operator {

	public static void main(String[] args) {
		
		//조건연산자(삼항연산자)
		//조건식 ? 참 : 거짓
		//두 수를 입력 후 더 큰 숫자를 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
//		int su1, su2, max;
//		
//		System.out.println("두 개의 숫자를 입력하세요");
//		su1 = sc.nextInt();
//		su2 = sc.nextInt();
//		
//		max = su1 > su2 ? su1 : su2;
//		
//		System.out.println(max + "입니다.");
		
		//세 개의 숫자를 입력 후 더 큰 숫자를 출력하세요
		int su1, su2, su3, max;
		
		System.out.println("세 개의 숫자를 입력하세요");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		su3 = sc.nextInt();
		
		max = su1 > su2 && su1 > su3 ? su1 : su2 > su1 && su2 > su3 ? su2 : su3;
		
		System.out.println(max + "입니다");
		
	}
	
}
