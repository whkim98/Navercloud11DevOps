package DAY0320;

import java.util.Scanner;

public class Q3_ArraySearchNum {

	public static void main(String[] args) {

		/*
		 * 숫자(num)를 입력하여 배열에 몇 번째에 있는지 출력
		 * 없을 경우 없다고 메세지 출력
		 * 반복해서 검색(0입력시 종료)
		 */

		int[] data = {12, 3, 6, 1, 7, 10, 8, 5, 16, 19};

		Scanner sc = new Scanner(System.in);
		int num = 0;



		while(true) {
			int searchIndex = -1;

			System.out.println("숫자를 입력해 주세요(0제외)");
			num = sc.nextInt();

			if(num == 0) {
				System.out.println("검색을 종료합니다.");
				break;
			}

			for(int i = 0; i < data.length; i++) {
				if(num == data[i]) {
					searchIndex = i;
					break;

				}

			}
				if(searchIndex == -1) {
					System.out.println(num + "은 데이터에 없습니다.");
				}else {
					System.out.println(num + "은 " + (searchIndex + 1) + "번째에 있습니다.");
				}


		}

	}}
