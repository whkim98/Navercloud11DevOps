package DAY0321;

public class Ex1_RandomJungbok {
	
	public static void main(String[] args) {
		/*
		 * 1 ~ 30까지의 난수 10개를 발생시킬 때 중복처리하기
		 */
		
		int[] rand = new int[10];
		Loop:
		for(int i = 0; i < rand.length; i++) {
			int n = (int) (Math.random() * 30) + 1;
			rand[i] = n;
			
			//중복처리
			for(int j = 0; j < i; j++) {
				if(rand[i] == rand[j]) {
					i--;//다시 제자리로 가기 위해 
					continue Loop;
				}
			}
		}
		
		//순차적 정렬(오름차순)
		for(int i = 0; i < rand.length - 1; i++) {
			for(int j = i + 1; j < rand.length; j++) {
				if(rand[i] > rand[j]) {
					int temp = rand[i];
					rand[i] = rand[j];
					rand[j] = temp;
				}
			}
		}

		
		System.out.println("1 ~ 30 사이 중복되지 않은 난수 구하기");
		
		for(int i = 0; i < rand.length; i++) {
			System.out.printf("%4d", rand[i]);
		}
		
	}

}
