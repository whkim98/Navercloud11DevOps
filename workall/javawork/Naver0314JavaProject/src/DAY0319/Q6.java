package DAY0319;

import java.util.Scanner;

public class Q6 {
	
	public static void main(String[] args) {
		
		/*
		 * while문을 이용하여 score 점수를 입력받은 후
		 * 0을 입력하면 while문을 빠져나가서 총 갯수와 합계를 구하시오
		 * 단, 1 ~ 100이 아닌 값은 갯수와 합계에서 제외
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		int count = 0;
		int sum = 0;
		
		Loop:
			
		while(true) {
			System.out.println("점수? (0입력시 종료됩니다.)");
			score = sc.nextInt();
			
			if(score > 100 || score < 0) {
				System.out.println("잘못된 입력입니다.");
				continue Loop;
			} else if(score > 0 && score <= 100){
				count = count + 1;
				sum = sum + score;
			} else if(score == 0) {
				break;
			}
		}
		
		System.out.println("총 합계: " + sum);
		System.out.println("입력한 점수 갯수: " + count);
		
		sc.close();
		
	}

}
