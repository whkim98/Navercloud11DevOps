package DAY0315;

import java.util.Scanner;

public class Ex9Operator {

	public static void main(String[] args) {
		
		//증감연산자
		//전치일 경우는 1순위, 후치일 경우는 끝순위
		//단 단항일 경우는 상관없음
		
		int m = 5, n = 5;
		
		int a = 10, b = 10;
		
		//단항은 위치 상관없음
		m++;
		++n;
		
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		
		System.out.println("========================");
		
		a += m++; // a = a + m, m = m + 1
		System.out.println("a = " + a);
		System.out.println("m = " + m);
		
		System.out.println("========================");
		
		b += ++n; // n = n + 1, b = b + n
		System.out.println("b = " + b);
		System.out.println("n = " + n);
		
		System.out.println("========================");
		
		m = 5;
		System.out.println(m++);//출력 후 증가
		
		System.out.println("========================");
		
		n = 5;
		System.out.println(++n); // 증가 후 출력
		
		System.out.println("========================");
		
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		
		System.out.println("========================");
		
		
	}
	
}
