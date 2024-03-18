package DAY0318;

import java.util.Scanner;

public class Ex5_ScoreSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요");

		int score = sc.nextInt();

		if(score < 1 || score > 100) {
			System.out.println("잘못된 점수입니다.");
			return; //메인 메서드 종료
		}
		
		String grade = null;
		
		//스위치문에 수식 가능
//		switch(score/10) {
//		case 10:
//		case 9:
//			grade = "A";
//			break;
//		case 8:
//			grade = "B";
//			break;
//		case 7:
//			grade = "C";
//			break;
//		case 6:
//			grade = "D";
//			break;
//		default:
//			grade = "F";
//		}
		
		if(score >= 90) {
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println(score + "점은 " + grade + "학점입니다.");

	}

}
