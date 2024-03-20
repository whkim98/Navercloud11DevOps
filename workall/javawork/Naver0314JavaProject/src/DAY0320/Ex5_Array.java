package DAY0320;

public class Ex5_Array {
	
	public static void main(String[] args) {
		
		int[] data = {1, 2, 3, 4, 5, 6, -1, -2, -3, -4};
		int max = 0;
		int min = 0;
		max = min = data[0];
		
		System.out.println(data.length);
		
		for(int i = 1; i < data.length; i++) {
			if(max < data[i]) {
				max = data[i];
			}
		}
		
		System.out.println("최댓값: " + max);
		
		for(int i = 1; i < data.length; i++) {
			if(min > data[i]) {
				min = data[i];
			}
		}
		
		System.out.println("최솟값: " + min);
		
		//배열 데이터 중 양수의 갯수와 음수의 갯수를 구하시오
		int pcnt = 0;
		int mcnt = 0;
		
		for(int i = 0; i < data.length; i++) {
			if(data[i] > 0) {
				pcnt = pcnt + 1;
			}else if(data[i] < 0) {
				mcnt = mcnt + 1;
			}
		}
		
		System.out.println("양수의 갯수: " + pcnt);
		System.out.println("음수의 갯수: " + mcnt);
		
	}

}
