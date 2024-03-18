package DAY0318;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		/*
		 * 구구단? 11
		 * 잘못된 입력입니다.
		 * 
		 * 구구단? 5
		 * 
		 * ** 5단 **
		 * 5 x 1 = 5
		 * 5 x 2 = 10 ~~~
		 * 5 x 9 = 45
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		
		System.out.println("구구단 몇단하실?");
		su = sc.nextInt();
		
		if(su > 9 || su < 2) {
			System.out.println("잘못된 입력입니다.");
		}else {
			System.out.println("** " + su + "단 " + "**");
			for(int i = 1; i <= 9; i++) {
				System.out.println(su + " X " + i + " = " + su * i);
			}
		}
		
		sc.close();
		
	}
	
}
