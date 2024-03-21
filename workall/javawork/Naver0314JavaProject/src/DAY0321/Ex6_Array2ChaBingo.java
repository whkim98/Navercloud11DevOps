package DAY0321;

import java.util.Scanner;

public class Ex6_Array2ChaBingo {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int bingo;
		int count;
		
		/*
		 * 1 ~ 3 사이의 난수를 발생시키고 가로, 세로, 대각선 방향으로
		 * 같은 숫자가 나올 경우 bingo 변수를 1 증가하여 빙고 갯수를 구하고
		 * 같은 숫자가 없을 경우 꽝!!! 을 출력시키기
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			bingo = 0;
			
			//2차원 배열에 1 ~ 3의 값을 임의로 발생
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (int)(Math.random() * 3) + 1;
				}
			}
			
			//출력
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					System.out.printf("%4d", arr[i][j]);
				}
				System.out.println("\n");
			}
			
			//빙고갯수와 꽝 출력
			for(int i = 0; i < 3; i++) {
				if(arr[i][0] == arr[i][1] && arr[i][0] == arr[i][2]) {
					bingo++;
				}
				
				if(arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i]) {
					bingo++;
				}
			}
			
			if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
				bingo++;
			}
			
			if(arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) {
				bingo++;
			}
			
			if(bingo == 0) {
				System.out.println("꽝");
			}else {
				System.out.println("\t빙고 " + bingo + "개");
			}
			
			System.out.println("=".repeat(35));
			
			String ans = sc.nextLine();
			if(ans.equalsIgnoreCase("x")) {
				System.out.println("빙고를 종료합니다.");
				break;
			}
		}
		
	}

}
