package DAY0318;

import java.util.Scanner;

public class Ex4_Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year, month, days;
		boolean flag;
		
		System.out.println("년도를 입력하세요");
		
		year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { //윤년 공식
			flag = true;
			System.out.println(year + "년은 윤년입니다.");
		}else {
			flag = false;
			System.out.println(year + "년은 평년입니다.");
		}
		
		System.out.println("월을 입력하세요");
		
		month = sc.nextInt();
		//1보다 작거나 12보다 크면 "잘못 입력했어요" 출력 후 main함수 종료
		
		if(month > 12 || month < 1) {
			System.out.println("잘못된 입력입니다.");
			return;
		} else {
			System.out.println("입력하신 월은 " + month + "입니다");
		}
		
		//switch문으로 해보기
//		switch(month) {
//		case 2:
//			days = flag ? 29 : 28;
//			System.out.println("일은 " + days + "입니다.");
//			break;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			days = 30;
//			System.out.println("일은 " + days + "입니다.");
//			break;
//		default:
//			days = 31;
//			System.out.println("일은 " + days + "입니다.");
//			
//		}
		
		//if로 해보기
		if(month == 2) {
			days = flag ? 29 : 28;
			System.out.println("일은 " + days + "입니다");
		}else if(month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
			System.out.println("일은 " + days + "입니다.");
		}else {
			days = 31;
			System.out.println("일은 " + days + "입니다.");
		}
		
		System.out.println("===============");
		System.out.println(year + "년 " + month + "월은 " + days + "까지 있습니다.");
		
	}
	
}
