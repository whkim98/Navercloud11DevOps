package DAY0314;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름");
		String name = sc.nextLine();
		
		System.out.println("나이");
		int age = sc.nextInt();
		
		System.out.println("사는 곳");
		String loc = sc.next();
		
		sc.nextLine();
		
		System.out.println("년도");
		int year = sc.nextInt();
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("사는 곳: " + loc);
		System.out.println("년도: " + year);
		
	}
	
}
