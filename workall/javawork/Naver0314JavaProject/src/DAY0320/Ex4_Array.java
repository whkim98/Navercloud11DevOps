package DAY0320;

public class Ex4_Array {
	
	public static void main(String[] args) {
		
		//배열을 선언하면서 초기값을 지정하는 경우
		int[] arr1 = {4, 6, 8, 10, 30};
		System.out.println("** 출력 #1 **");
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%4d", arr1[i]);
		}
		
		System.out.println();
		
		System.out.println("** 출력 #2 **");
		for(int n: arr1) {
			System.out.printf("%4d", n);
		}
		
		System.out.println();
		System.out.println("=".repeat(35));
		
		int[] arr2;
		arr2 = new int[] {10, 20, 30, 40};
		System.out.println(arr2.length + "개");
		
		for(int n: arr2) {
			System.out.printf("%4d", n);
		}
		
		System.out.println();
		System.out.println("=".repeat(35));
		
		//문자열 배열
		String[] str1 = {"김영자", "이미자", "강호동", "이재성"};
		String[] str2;
		
		str2 = new String[] {"사과", "오렌지", "딸기", "수박", "참외"};
		
		for(int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}
		
		System.out.println("=".repeat(35));
		
		for(String i: str2) {
			System.out.println(i);
		}
		
		System.out.println("=".repeat(35));
		
	}

}
