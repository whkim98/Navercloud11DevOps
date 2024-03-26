package DAY0326;

public class Ex11_Exception {
	
	public static void main(String[] args) {
		
		int[] arr = {3, 5, 7, 10};
		
		for(int i = 0; i <= arr.length; i++) {
		try {
			System.out.println(i + ": " + arr[i]);
		}catch(Exception e) {
			System.err.println("에러발생: " + e.getMessage());
		}
		}
		System.out.println("** 종료 **");
		
	}

}
