package DAY0315;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		/*
		 * name, hp, birthYear를 입력받은 후 
		 * 이름, 핸드폰, 태어난 년도, 나이(2024 - 태어난 년도)를 출력하는 프로그램을 작성하시오
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		String hp = "";
		int birthYear = 0;
		
		System.out.println("이름을 입력하세요");
		name = sc.nextLine();
		
		System.out.println("핸드폰 번호를 입력하세요 (-를 포함하여 적어주세요)");
		hp = sc.nextLine();
		
		System.out.println("태어난 년도를 입력하세요");
		birthYear = sc.nextInt();
		
		sc.nextLine();
		
		int age = 2024 - birthYear + 1;
		
		System.out.println("입력하신 이름은 " + name + "입니다.");
		System.out.println("입력하신 핸드폰 번호는 " + hp + "입니다.");
		System.out.println("입력하신 년도는 " + birthYear + "입니다.");
		System.out.println("나이는 " + age + "입니다.");
		System.out.printf("태어난 년도는 %.0f, 나이는 %.0f입니다.\n", (float)birthYear, (float)age);
		System.out.printf("태어난 년도는 %d, 나이는 %d입니다.", birthYear, age);
		
		
		
	}
	
}
