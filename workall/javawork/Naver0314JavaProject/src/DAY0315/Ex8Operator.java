package DAY0315;

import java.util.Scanner;

public class Ex8Operator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 숫자 입력");
		int su = sc.nextInt();
		int su2 = sc.nextInt();
		
		System.out.println("더하기: " + (su + su2));
		System.out.println("빼기: " + (su - su2));
		System.out.println("곱하기: " + (su * su2));
		System.out.printf("나누기: %.2f\n", ((double)su / su2)); //(double)(su / su2)는 안 됨ㅋㅋ 
		System.out.println("나머지: " + (su % su2));
		
	}
	
}
