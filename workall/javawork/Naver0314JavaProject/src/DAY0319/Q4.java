package DAY0319;

public class Q4 {
	
	public static void main(String[] args) {
		
		System.out.printf("%50s\n\n", "[구구단]");
		
		for(int dan = 2; dan <= 9; dan++) {
			
			System.out.printf("**%d단**\t\t", dan);
			
		}
		
		System.out.println();
		System.out.println("=".repeat(130));
		
		for(int i = 1; i <= 9; i++) {
			
			for(int dan = 2; dan <= 9; dan++) {
				
				System.out.printf("%d X %d = %2d\t", dan, i, dan * i);
				
			}
			
			System.out.println();
			
		}
		
	}

}
