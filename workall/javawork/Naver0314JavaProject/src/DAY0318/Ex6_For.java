package DAY0318;

public class Ex6_For {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%4d\n", i);
		}
		System.out.println("==============================1");
		
		for(int i = 10; i >= 1; i--) {
			System.out.printf("%4d\n", i);
		}
		System.out.println("==============================2");
		
		for(int i = 1; i <= 10; i+=3) {
			System.out.printf("%4d\n", i);
		}
		System.out.println("==============================3");
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.printf("%4c\n", i);
		}
		System.out.println("==============================4");
		
		for(int i = 65; i <= 90; i++) {
			System.out.printf("%4c\n", i);
		}
		System.out.println("==============================5");
		
		for(int i = 'a' + 'A'; i <= 'z' + 'Z'; i++) {
			System.out.printf("%4c\n", i);
		}
		System.out.println("==============================6");
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%3d\n", i);
			if(i == 5) {
				break;
			}
		}
		System.out.println("==============================7");
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
		}
		System.out.println("==============================8");

	}
	
}
