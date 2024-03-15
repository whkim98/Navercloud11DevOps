package DAY0315;

import java.util.Scanner;

public class Ex5Scanner {

	public static void main(String[] args) {
		
		//Scanner 선언
		Scanner sc = new Scanner(System.in);
		String msg = "";
		System.err.println("메세지를 입력하세요");
		
		msg = sc.nextLine();
		
		System.out.println("입력하신 문자: \"" + msg + "\" 를 입력하셨습니다."); //   \"는 문자열에 "를 포함시킨다. (작은 따옴표도 마찬가지임)
		
		int age = 0;
		System.out.println("당신의 나이를 입력하세요");
		
		age = sc.nextInt();
		//age = Integer.parseInt(sc.nextLine());
		
		System.out.println("입력하신 나이는 " + age + "세 입니다.");
		
	}
	
}
