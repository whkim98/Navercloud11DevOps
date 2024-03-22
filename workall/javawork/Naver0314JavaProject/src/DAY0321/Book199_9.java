package DAY0321;

import java.util.Scanner;

public class Book199_9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		int student;
		int score = 0;
		int max= 0;
		int[] scores = {};
		
		
		
		while(true) {
			System.out.println("=".repeat(60));
			System.out.println("1. 학생수 2. 점수입력 3. 점수리스트 4. 분석 5. 종료");
			System.out.println("=".repeat(60));
			System.out.println("선택");
			choice = sc.nextInt();
			boolean exit = false;
			switch(choice) {
			case 1:
				System.out.println("학생수");
				student = sc.nextInt();
				scores = new int[student];
				break;
			case 2:
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>");
					score = sc.nextInt();
					scores[i] = score;
					max = scores[0];
				}
				break;
			case 3:
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				break;
			case 4:
				for(int i = 1; i < scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				int sum = 0;
				for(int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
				}
				
				double avg = sum / scores.length;
				
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				break;
				
			case 5:
				System.out.println("프로그램 종료");
				exit = true;
				break;
			}
			if(exit == true) {
				break;
			}
			
		}
		
		sc.close();
		
	}

}
