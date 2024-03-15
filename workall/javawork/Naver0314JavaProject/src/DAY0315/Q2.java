package DAY0315;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		/*
		 * 백만 단위의 금액을 입력받은 후
		 * 만원, 천원, 백원, 십원, 일원 단위로 몇 개인지 출력하세요 
		 * 예)
		 * 금액입력
		 * 4567893
		 * 만원: 456장
		 * 천원: 7장
		 * 백원: 8개
		 * 십원: 9개
		 * 일원: 3개
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 백만 단위로 입력하세요(7자리)");
		
		int money = sc.nextInt();
		
		System.out.println("만원: " + money / 10000);
		System.out.println("천원: " + (money % 10000) / 1000);
		System.out.println("백원: " + (money % 1000) / 100);
		System.out.println("십원: " + (money % 100) / 10);
		System.out.println("일원: " + (money % 10) / 1);
		
		
	}
	
}
