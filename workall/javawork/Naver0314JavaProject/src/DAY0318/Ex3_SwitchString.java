package DAY0318;

import java.util.Scanner;

public class Ex3_SwitchString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String color = "";
		
		System.out.println("red, green, pink중 선택");
		
		color = sc.nextLine();
		
		switch(color) {
		case "RED":
			
		case "red":
			System.out.println("red");
			break;
		case "GREEN":
			
		case "green":
			System.out.println("green");
			break;
		case "PINK":
			
		case "pink":
			System.out.println("pink");
			break;
		default: 
			System.out.println("잘못된 선택");
		}
		
	}
	
}
