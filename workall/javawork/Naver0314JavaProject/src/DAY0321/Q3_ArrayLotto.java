package DAY0321;

import java.util.Scanner;

public class Q3_ArrayLotto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] lotto = new int[6];
		int money;

		/*
		 * money를 입력하면 해당 횟수만큼 로또구하기
		 * 로또: 1 ~ 45까지의 중복되지 않은 숫자
		 * 
		 * 로또금액입력? 800
		 * 금액이 부족합니다
		 * 
		 * 로또금액입력? 0
		 * 종료합니다
		 * 
		 * 로또금액입력? 3000
		 * 1회: 4 7 12 34 44 45
		 * 2회: 3 7 9  13 39 42
		 * 3회: ~~~
		 * 
		 * 
		 */
		
			while(true) {
				System.out.println("로또금액입력?");
				money = sc.nextInt();
				int count = 0;
				
				if(money == 0) {
					System.out.println("종료합니다.");
					break;
				}
				
				if(money < 1000) {
					System.out.println("금액이 부족합니다");
					continue;
				}
				
				for(int q = 1; q <= (money / 1000); q++) {
					count = count + 1;
					Loop:
					for(int i = 0; i < lotto.length; i++) {
						int n = (int)(Math.random() * 45 + 1);
						lotto[i] = n;

						for(int j = 0; j < i; j++) {
							if(lotto[i] == lotto[j]) {
								i--;
								continue Loop; //두 번째 for문 아래에 다른 코드가 없으므로 break가능
							}
						}
					}

					for(int i = 0; i < lotto.length - 1; i++) {
						for(int j = i + 1; j < lotto.length; j++) {
							if(lotto[i] > lotto[j]) {
								int temp = lotto[i];
								lotto[i] = lotto[j];
								lotto[j] = temp;
							}
						}
					}

					System.out.print(count + "회차: ");
					for(int i = 0; i < lotto.length; i++) {
						System.out.printf("%4d", lotto[i]);
					}

					System.out.println();

				}
			}

	}

}
