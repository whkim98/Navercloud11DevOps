package DAY0321;

public class Ex2_ArraySort {
	
	public static void main(String[] args) {
		
		//두 값을 바꿀 경우
		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("a = " + a + ", b = " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = " + a + ", b = " + b);
		
		int[] arr = {5, 8, 2, 1, 10};
		//selection sort
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) { //내림차순은 arr[i] < arr[j]
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
