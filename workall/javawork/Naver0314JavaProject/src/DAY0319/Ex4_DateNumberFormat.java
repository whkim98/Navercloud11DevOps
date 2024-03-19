package DAY0319;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex4_DateNumberFormat {
	
	public static void main(String[] args) {
		
		//날짜 포멧
		Date date = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");
		
		System.out.println(sdf1.format(date));
		
		System.out.println("=".repeat(35));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss EEE");
		
		System.out.println(sdf2.format(date));
		
		System.out.println("=".repeat(35));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분");
		
		System.out.println(sdf3.format(date));
		
		//숫자 포멧
		int money = 5678900;
		double average = 98.7256;
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		System.out.println(nf1.format(money));
		
		System.out.println("=".repeat(35));
		
		//따로 생성하지 않고 바로 호출
		System.out.println(NumberFormat.getCurrencyInstance().format(money));
		System.out.println(NumberFormat.getInstance().format(money));
		
		System.out.println("=".repeat(35));
		
		//평균값을 소숫점 이하 1자리로 출력
		NumberFormat nf2 = NumberFormat.getInstance();
		nf2.setMaximumFractionDigits(2);
		System.out.println(nf2.format(average));
		
	}

}
