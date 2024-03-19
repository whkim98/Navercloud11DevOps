package DAY0319;

import java.util.Calendar;
import java.util.Date;

public class Ex3_DateCalendar {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//Date 클래스를 이용해서 년, 월, 일, 시, 분, 초 출력
		Date date = new Date();
		
		System.out.println("년: " + (date.getYear() + 1900));
		System.out.println("월: " + (date.getMonth() + 1));
		System.out.println("일: " + date.getDate());
		System.out.println(date.getHours() + "시");
		System.out.println(date.getMinutes() + "분");
		System.out.println(date.getSeconds() + "초");
		
		switch(date.getDay()) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		}
		
		System.out.println("=".repeat(35));
		System.out.println("calendar를 이용한 출력");
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);
		
		System.out.printf("%d년 %d월 %d일입니다\n", year, month + 1, day);
		
		System.out.println("=".repeat(35));
		
		
		
	}

}
