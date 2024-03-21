package DAY0321;

public class Ex3_ArrayStringSort {
	
	public static void main(String[] args) {
		
		String[] arr = {"하석진", "강호동", "강호마", "Candy", "손석구"};
		
		//정렬
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(String s: arr) {
			System.out.println(s);
		}
		
	}

}
