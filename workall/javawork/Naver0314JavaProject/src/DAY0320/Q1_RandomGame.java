package DAY0320;

import java.util.Random;
import java.util.Scanner;


public class Q1_RandomGame {

	public static void main(String[] args) {

		/*
		 * 1 ~ 100 사이의 난수를 발생한 후 숫자 알아맞추기
		 * 숫자 입력시 앞에 횟수 출력
		 * 숫자(n)가 난수보다 크면 (n보다 작습니다)
		 * 드디어 숫자를 맞췄을 경우 (횟수와 정답을 출력 후 계속 숫자 맞추기 게임을 하시겠습니까?
		 * y/n 을 통해 계속할지 종료할지 ㄱㄱ
		 */

		
			
		Scanner sc = new Scanner(System.in);

		int n = 0;
		

		Exit:
		
		Loop1:
			while(true) {
				int count = 0;
				Random ran = new Random();
				int su = ran.nextInt(100) + 1;

				Loop:
				while(true) {
					System.out.println("숫자를 입력하세요");
					count += 1;
					System.out.println(count + "회");
					n = sc.nextInt();
					if(n > su) {
						System.out.println(n + "이 난수보다 큽니다" + su);
						continue Loop;
					}else if(n < su) {
						System.out.println(n + "이 난수보다 작습니다." + su);
						continue Loop;
					}else if(n == su) {
						System.out.println("정답!");
						System.out.println("(Y/N)");
						String msg = sc.next();
						sc.nextLine();
						if(msg.equals("Y") || msg.equals("y")) {
							System.out.println("게임을 다시 시작합니다");
							continue Loop1;
						}else if(msg.equals("n") || msg.equals("N")){
							System.out.println("게임을 종료합니다.");
							break Exit;
						}
					}
				}
				

			}
		

	}

}
