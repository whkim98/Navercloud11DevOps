package DAY0318;

public class Ex7_MultiFor {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("hello");
			for(int j = 1; j <= 3; j++) {
				System.out.print("\tkitty");
			}
			System.out.println();
		}
		System.out.println("============================");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 3 ; j++) {
				System.out.printf("i = %d, j = %d\n", i, j);
				if(j == 2) {
					break;
				}
			}
			System.out.println();
		}
		System.out.println("============================");
		Exit: 
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 3 ; j++) {
				System.out.printf("i = %d, j = %d\n", i, j);
				if(j == 2) {
					break Exit; // for문 두 개를 한 번에 빠져나
				}
			}
			System.out.println();
		}
		System.out.println("============================");
		
	}
	
}
