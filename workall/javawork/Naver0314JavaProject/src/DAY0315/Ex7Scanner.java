package DAY0315;

import java.util.Scanner;

public class Ex7Scanner {

	public static void main(String[] args) {
		
		//Scanner 선언
		Scanner sc = new Scanner(System.in);
		
		int kor, eng;
		
		String name;
		
		System.out.println("국어점수?");
		kor = Integer.parseInt(sc.nextLine());
		
		System.out.println("영어점수?");
		eng = Integer.parseInt(sc.nextLine());
		
		System.out.println("이름?");
		name = sc.nextLine();
		
		System.out.println("이름: " + name);
		System.out.printf("국어점수: %d점, 영어점수: %d점\n", kor, eng);
		System.out.printf("총점: %d점, 평균: %.2f점", kor + eng, (kor + eng) / 2.0);
		
		
	}
	
}
