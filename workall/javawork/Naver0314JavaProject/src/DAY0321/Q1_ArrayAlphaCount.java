package DAY0321;

import java.util.Scanner;

public class Q1_ArrayAlphaCount {
	
	public static void main(String[] args) {
		
		/*
		 * 영어 문장을 입력하면 알파벳 기준으로 각각의 갯수를 출력하시오
		 * Have a nice day!!!
		 * 
		 * a: 3개
		 * b: 0개
		 * ~~~
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		String msg = null;
		int[] alpha = new int[26];
		
		System.out.println("영어 문장을 입력하셈");
		msg = sc.nextLine();
		
		for(int i = 0; i < msg.length(); i++) {
			char ch = msg.toUpperCase().charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
			alpha[ch - 'A']++;
			}
		}
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.printf("%c: %d\t", (char)('A' + i), alpha[i]);
			if((i + 1)% 5 == 0) {
				System.out.println();
			}
		}
		
		sc.close();
		
	}

}
