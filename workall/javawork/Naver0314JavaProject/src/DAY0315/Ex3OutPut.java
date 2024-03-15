package DAY0315;

public class Ex3OutPut {

	public static void main(String[] args) {
		
		int year = 2023;
		int month = 3;
		int day = 15;
		
		String msg = "Have a Nice Day";
		
		char blood = 'B';
		
		double avg = 97.4567;
		
		System.out.println("** 출력 1 **");
		System.out.println("날짜: " + year + "-" + month + "-" + day);
		
		System.out.print("혈액형: " + blood + "형"); //print는 다음 줄로 넘어가지 않음
		
		System.out.println(",\t평균: " + avg);
		System.out.println("======================");
		
		//printf는 변환기호를 이용(JDK5부터 이용 가능)
		//정수: %d, 실수: %f, 문자: %c, 문자열: %s
		System.out.printf("**%40s**\n\n", msg); //40칸 우측으로 이동 후 출력
		System.out.printf("**%-40s**\n\n", msg); //40칸 좌측으로 이동 후 출력
		System.out.printf("**%s**\n", msg);
		
		System.out.printf("날짜: %d-%d-%d\n", year, month, day);			//날짜: 2023-3-15
		System.out.printf("날짜: %2d-%2d-%2d\n", year, month, day);		//날짜: 2023- 3-15
		System.out.printf("날짜: %02d-%02d-%02d\n", year, month, day);	//날짜: 2023-03-15
		
		System.out.printf("나의 혈액형은 %c형입니다\n", blood);
		
		System.out.printf("평균: %3.1f점\n", avg); //%3.1: 전체 자릿수 3자리, 소숫점 이하 1자리
		System.out.printf("평균: %10.2f점\n", avg); //%10.2: 전체 자릿수 10자리, 소숫점 이하 2자리(남을 경우 공백처리)
		System.out.printf("평균: %-10.2f점\n", avg); //%10.2: 전체 자릿수 10자리, 소숫점 이하 2자리(남을 경우 공백처리, 왼쪽으로)
		
		
		
	}
	
}
