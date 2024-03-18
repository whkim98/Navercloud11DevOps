package DAY0318;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		/*
		 * name, basic, family를 키보드로 입력 후
		 * 가족수가 3인 이상이면 기본급 + (가족수 * 50000)으로 실수령액(total)을 출력하고
		 * 가족수가 3인 미만이면 기본급 + 30000으로 실수령액을 출력하시오
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		int basic = 0;
		int family = 0;
		int total = 0;
		
		System.out.println("이름을 입력하세요");
		name = sc.nextLine();
		
		System.out.println("기본급을 입력하세요");
		basic = sc.nextInt();
		
		System.out.println("가족수를 입력하세요");
		family = sc.nextInt();
		
		if(family >= 3) {
			total = basic + (family * 50000);
		}else {
			total = basic + 30000;
		}
		
		System.out.println("이름: " + name + "\n" + "기본급: " + basic + "원\n" + "가족수: " + family + "명\n" + "실수령액: " + total + "원");
		
	}
	
}
