package DAY0326;

import java.util.Scanner;

public class Ex12_Exception {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("두 수를 입력하세요");
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();

			if(s1.equals("x") || s2.equals("x")) {
				break;
			}

			//숫자형태의 문자열을 숫자로 변환

			//숫자변환시 문자가 섞이면 numberformatException 발생
			try {
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);

				int sum = n1 + n2;
				System.out.printf("%d + %d = %d\n\n", n1, n2, sum);
			}catch(Exception e){
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
				e.printStackTrace();
			}
		}

		System.out.println("** 정상종료 **");

	}

}
