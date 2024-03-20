package DAY0320;

import java.util.Scanner;

public class Q4_ArraySearchString {
	
	public static void main(String[] args) {
		
		String[] members = {"강호동", "한가인", "유재석", "이승민", "강하나", 
				"손미나", "이영자", "박남정", "한지혜", "손창민"};
		
		/*
		 * 검색할 이름(searchName)을 입력하면 몇 번째에 있는지 출력
		 * 없을 경우 없다고 출력
		 * (반복 검색하다가 'q'나 'Q'를 입력시 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		String searchName = "";
		
		while(true) {
			int searchIndex = -1;
			
			System.out.println("이름을 입력해 주세요");
			searchName = sc.nextLine();
			
			if(searchName.equals("q") || searchName.equals("Q")) {
				System.out.println("검색을 종료합니다");
				break;
			}
			
			for(int i = 0; i < members.length; i++) {
				if(searchName.equals(members[i])) {
					searchIndex = i;
					break;
				}
			}
			
			if(searchIndex == -1) {
				System.out.println(searchName + "는 데이터에 없습니다");
			}else {
				System.out.println(searchName + "는 " + (searchIndex + 1) + "번에 있습니다.");
			}
			
		}
		
		sc.close();
		
	}

}
