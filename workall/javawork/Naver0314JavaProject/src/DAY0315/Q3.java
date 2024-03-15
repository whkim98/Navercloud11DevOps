package DAY0315;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		/*
		 * 점수(score)를 입력받아
		 * 점수가 90 이상이면 "참 잘했어요"
		 * 점수가 80 이상이면 "수고했어요"
		 * 점수가 70 이상이면 "조금 더 노력하세요"
		 * 나머지			  "재시험입니다!"
		 * 메세지를 저장할 문자열 변수명은 msg
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		
		int score = sc.nextInt();
		
		String msg = "";
		
		msg = score >= 90 ? msg = "참 잘했어요" : score >= 80 ? msg = "수고했어요" : score >= 70 ? msg = "조금 더 노력하세요" : "재시험입니다!";
		
		System.out.println(msg);
		
	}
	
}
