package DAY0318;

import java.util.Scanner;

public class Ex8_For {

	public static void main(String[] args) {
		
		System.out.println("1 ~ 100까지 합계 구하기");
		
		int sum = 0;
		
		int summ = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		
		System.out.println("합계: " + sum);
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		System.out.println("합계를 구할 시작값을 입력해 주세요");
		x = sc.nextInt();
		
		System.out.println("합계를 구할 끝값을 입력해 주세요");
		y = sc.nextInt();
		
		for(int j = x; j <= y; j++) {
			summ = summ + j;
		}
		
		System.out.printf("%d부터 %d까지 합: %d", x, y, summ);
		
	}
	
}
