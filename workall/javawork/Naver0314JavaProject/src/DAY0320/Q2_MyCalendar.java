package DAY0320;

import java.util.Date;
import java.util.Scanner;

public class Q2_MyCalendar {

	public static void main(String[] args) {
		
		/*
		 * 년도와 월을 입력하면 해당 달력을 출력하게 하시오
		 * 
		 * 만년 달력을 만들기 위해서 알아야 할 사항 2가지
		 * 1. 내가 입력한 년도-월의 1일이 무슨 요일인가?
		 * 2. 해당 월이 몇일까지 있는가?
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int year = 0;
		int month = 0;
		int week = 0;
		int endday = 0;
		
		System.out.println("달력을 조회할 년도를 입력하세요");
		year = sc.nextInt();
		
		System.out.println("달력을 조회할 월을 입력하세요");
		month = sc.nextInt();
		
		if(month < 1 || month > 12) {
			System.out.println("잘못된 입력");
			return;
		}
		
		System.out.printf("\t%10d년 %d월 달력\n\n", year, month);
		System.out.println("=".repeat(50));
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("=".repeat(50));
		
		//1. 내가 입력한 년도-월의 1일이 무슨 요일인가?
		Date date = new Date(year - 1900, month - 1, 1);//입력한 달의 1일의 요일 구하기
		week = date.getDay();
//		System.out.println(week);
		
		//2. 내가 입력한 년도의 월이 몇 일까지 있는가?
		switch(month) {
		case 2:
			endday = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			endday = 30;
			break;
		default:
			endday = 31;
			break;
		}
		
//		for(int i = 1; i <= endday; i++) {
//			System.out.print("\t".repeat(week - 1));
//			if(i % 7 == 0) {
//				System.out.print("\t" + i);
//				System.out.print("\n");
//			}
//		}
		
		for (int i = 0; i < week; i++) {
		    System.out.print("\t");
		}
		
		for (int i = 1; i <= endday; i++) {
		    System.out.print(i + "\t");
		    if ((i + week) % 7 == 0) {
		        System.out.println(); // 한 주가 끝나면 줄 바꿈
		    }
		}


		
	}
	
}
