package DAY0316;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		/*
		 * 점수(score)를 입력받아
		 * 점수가 90 이상이면 "참 잘했어요"
		 * 점수가 80 이상이면 "수고했어요"
		 * 점수가 70 이상이면 "조금 더 노력하세요"
		 * 나머지			  "재시험입니다!"
		 * 메세지를 저장할 문자열 변수명은 msg
		 */

		//		Scanner sc = new Scanner(System.in);
		//		
		//		System.out.println("점수를 입력하세요");
		//		
		//		int score = sc.nextInt();
		//		
		//		String msg = "";
		//		
		//		msg = score >= 90 ? msg = "참 잘했어요" : score >= 80 ? msg = "수고했어요" : score >= 70 ? msg = "조금 더 노력하세요" : "재시험입니다!";
		//		
		//		System.out.println(msg);

		Scanner sc = new Scanner(System.in);

		for (;;) { // 무한 루프
			System.out.println("점수 입력");
			int score = sc.nextInt();

			if (score >= 0 && score <= 100) {
				String msg = "";

				if (score >= 90) {
					msg = "참 잘했어요";
				} else if (score >= 80) {
					msg = "수고했어요";
				} else if (score >= 70) {
					msg = "조금 더 노력하세요";
				} else {
					msg = "재시험입니다.";
				}

				System.out.println(msg);

				if(score >= 70) {
					break; // 올바른 점수를 입력했거나 재시험이 아닐 때 무한루프 종료
				}else if(score > 0 && score < 70){
					System.out.println("재시험 점수를 입력해 주세요");
				}

			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}

		sc.close();

	}
}

