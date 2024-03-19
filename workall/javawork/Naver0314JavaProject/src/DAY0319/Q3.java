package DAY0319;

public class Q3 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			
			for(int dan = 2; dan <= 9; dan++) {
				
				System.out.printf("%d X %d = %2d\t", dan, i, dan * i);
				
			}
			
			System.out.println();
			
		}
		
	}

}
