package DAY0326;

import java.util.Date;

public class Ex13_Exception {
	
	public static void go1() throws NullPointerException, NumberFormatException{
//		Date date = null;
		Date date = new Date();
		System.out.println(date.getYear() + 1900);
		
		String a = "12a";
		int n = Integer.parseInt(a);
		System.out.println(n + 10);
	}
	
	public static void main(String[] args) {
		
		try {
			go1();
		}catch(NullPointerException e) {
			System.out.println("Date 클래스 생성을 안 하고 메서드 호출" + e.getMessage());
		}catch(NumberFormatException e1) {
			System.out.println("문자로 인한 오류 발생" + e1.getMessage());
		}
		
		System.out.println("정상종료");
		
	}
	
}
