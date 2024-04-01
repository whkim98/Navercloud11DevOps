package DAY0315;

public class Ex2DataType {

	public static void main(String[] args) {

		//정수타입
		byte a = 127;
		System.out.println(a);
		
		a = (byte) 200; //(byte) = cast연산자
						// - 강제 형변환, 값 손실 발생
		System.out.println(a); //값 손실이 발생할 경우 내부적으로 2의 보수값 출력
		
		//실수타입
		float b = 123.567891234f; //f를 붙여야 4바이트 float로 저장
		double c = 123.567891234;
		
		System.out.println(b); //보통 정밀도 8자리까지 정확히 나옴
		System.out.println(c); //보통 정밀도가 15자리까지 정확히 나옴
		
		//1글자 지정은 char, 문자열은 String(객체타입)
		char ch1 = 'A';
		char ch2 = '가';//2바이트라 한글 한글자도 가능
		
		System.out.println(ch1 + 1);
		System.out.println(ch2);
		
		//문자열 지정하는 방법
		String str1 = new String("happy"); //방법1
		String str2 = "hello";			   //방법2
		
		System.out.println(str1);
		System.out.println(str2);
		
		//긴 문자열을 지정하는 경우
		String str3 = "오늘은 즐거운 금요일인데 할 일이 없다. ~~~";
		String str4 = "나는 오늘도 자바를 공부한다. \n" 
					  + "오늘은 즐거운 금요일\n" + "어쩌고 저쩌고";
		
		System.out.println(str3);
		System.out.println();
		System.out.println(str4);
		
		//JDK15부터 가능(텍스트 블럭)
		String str5 = """
				ㅋㅋㅋ
				ㅋ
				켘
				""";
		
		System.out.println("\n" + str5);
		
		
	}
	
}
