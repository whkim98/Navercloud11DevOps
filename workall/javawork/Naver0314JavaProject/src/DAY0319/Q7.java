package DAY0319;

import java.util.Scanner;

public class Q7 {
	
	public static void main(String[] args) {
		
		/*
		 * 문제
		 * String 타입의 문자열(msg)를 입력받아
		 * 그 문자열 안에 대문자, 소문자, 숫자가 몇 개가 포함되어 있는지 출력하세요
		 * 
		 * 예)
		 * 대문자: 2개
		 * 소문자: 6개
		 * 숫자:  3개
		 * 
		 * String의 charAt과 length를 사용
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String msg = "";
		int acount = 0;
		int bcount = 0;
		int ccount = 0;
		int dcount = 0;
		
		System.out.println("문자를 입력하셈");
		msg = sc.nextLine();
		
		
		for(int i = 0; i < msg.length(); i++) {
			if(msg.charAt(i) >= 'A' && msg.charAt(i) <= 'Z') {
				acount = acount + 1;
			}else if(msg.charAt(i) >= 'a' && msg.charAt(i) <= 'z') {
				bcount = bcount + 1;
			}else if(msg.charAt(i) >= 48 && msg.charAt(i) <= 57){
				ccount = ccount + 1;
			}else {
				dcount = dcount + 1;
			}
		}
		sc.close();
		System.out.println("대문자: " + acount);
		System.out.println("소문자: " + bcount);
		System.out.println("숫자: " + ccount);
		System.out.println("그 외: " + dcount);
		
	}

}
