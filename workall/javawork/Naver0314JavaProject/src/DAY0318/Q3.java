package DAY0318;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		/*
		 * 상품명(sang)과 수량(su), 단가(dan)을 입력받은 후
		 * 총급액(total)을 구하고 만약 수량이 5개 이상이면
		 * "10프로 할인입니다"와 함께 할인된 금액(dctotal)을 출력하세요
r		 */
		
		Scanner sc = new Scanner(System.in);
		
		String sang = "";
		int su = 0;
		int dan = 0;
		int total = 0;
		double dctotal = 0;
		
		System.out.println("상품명을 입력하세요");
		sang = sc.nextLine();
		
		System.out.println("수량을 입력하세요");
		su = sc.nextInt();
		
		System.out.println("단가를 입력하세요");
		dan = sc.nextInt();
		
		total = su * dan;
		dctotal = su * dan * 0.9;
		
		System.out.println(sang + " " + su + "개의 총금액: " + total + "원");
		
		if(su >= 5) {
			System.out.println("수량이 5개 이상이므로 10%할인 됩니다.");
			System.out.println("10% 할인된 금액: " + (int)dctotal + "원");
		}
		
		sc.close();
		
	}
	
}
