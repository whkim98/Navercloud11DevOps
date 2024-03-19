package DAY0319;

public class Ex1_While {

	public static void main(String[] args) {
		
		int n = 10;
		
		while(n > 10) {
			System.out.println("Hello #1");
		}
		
		System.out.println("=".repeat(20));
		
		do {
			System.out.println("Hello #2");
		}while(n > 10); 
		
		System.out.println("=".repeat(20));
		
		int a = 1;
		while(a < 10) {
			System.out.printf("%3d\n", a++);
//			a++;
		}
		
		System.out.println("=".repeat(20));
		
		a = 1;
		while(true) {
			System.out.printf("%3d\n", a++);
			if(a > 10) {
				break;
			}
		}
		
		System.out.println("=".repeat(20));
		
		char ch = 'A';
		
		while(true) {
			System.out.printf("%3c", ch++);
			if(ch > 'Z') {
				break;
			}
		}
		
		System.out.println();
		System.out.println("=".repeat(20));
		
		
		
	}
	
}
