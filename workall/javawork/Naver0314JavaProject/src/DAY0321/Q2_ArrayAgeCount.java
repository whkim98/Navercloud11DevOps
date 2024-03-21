package DAY0321;

public class Q2_ArrayAgeCount {
	
	public static void main(String[] args) {
		
		int[] memberAges = {12, 56, 34, 23, 34, 59, 46, 6, 11, 29, 32
				, 49, 51, 38, 44, 55, 5, 7, 15, 28};
		
		int[] ageCount = new int[6];
		/*
		 * 연령별 인원수를 구해서 출력하세요
		 * 10세 미만: 3명
		 * 10대: 5명
		 * 20대: 2명
		 * ~~~
		 * 50대: 1명
		 */
		
//		System.out.println(memberAges[2]/10);
		
		for(int i = 0; i < memberAges.length; i++) {
			ageCount[memberAges[i]/10] ++;
		}
		
		
//		for(int i = 10; i < 60; i++) {
//			for(int j = 0; j < memberAges.length; j++) {
//				if(memberAges[j] % i == 0) {
//					ageCount[j]++;
//				}
//			}
//		}
//		
////		for(int i = 0; i < ageCount.length; i++) {
////			for(int j = 10; j < 60; j++) {
////				if(memberAges[i] % j == 0) {
////					ageCount[i]++;
////				}
////			}
////		}
		
		for(int i = 0; i < ageCount.length; i++) {
			if(i == 0) {
				System.out.println("10세 미만: " + ageCount[i] + "명");
			}else {
				System.out.println(i * 10 + "대: " + ageCount[i] + "명");
			}
		}
		
	}

}
