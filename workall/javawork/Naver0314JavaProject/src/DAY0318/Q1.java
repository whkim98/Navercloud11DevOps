package DAY0318;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		/*
		 * 조건연산자 이용
		 * 점수를 입력 후 점수가
		 * 90이상이면 'A'
		 * 80이상이면 'B'
		 * 70이상이면 'C'
		 * 60이상이면 'D'
		 * 나머지는 'F'
		 * 
		 * 예)
		 * 점수 89
		 * 89점은 B학점입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		
		int score = sc.nextInt();
		
		if(score < 1 || score > 100) {
			System.out.println("잘못된 점수입니다.");
			return; //메인 메서드 종료
		}
		
		String msg = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F";
		
		System.out.println(score + "점은 " + msg + "학점입니다.");
		
		sc.close();
		
	}
	
}
