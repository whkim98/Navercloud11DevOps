package DAY0318;

import java.util.Scanner;

public class Ex3_Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("숫자 1 ~ 3을 눌러보세요");
		
		num = sc.nextInt();
		
		System.out.println(num + "을(를) 눌렀어요");
		
		switch(num) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		default:
			System.out.println("OTHER NUMBER");
		}
		
	}
	
}
