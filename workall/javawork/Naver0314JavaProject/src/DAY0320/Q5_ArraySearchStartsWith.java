package DAY0320;

import java.util.Scanner;

public class Q5_ArraySearchStartsWith {
	
	public static void main(String[] args) {
		
		String[] members = {"강호동", "한가인", "유재석", "이승민", "강하나", 
				"손미나", "이영자", "박남정", "한지혜", "손창민"};
		
		/*
		 * 검색할 이름은? 강
		 * 1번째: 강호동
		 * 5번째: 강하나
		 * 총 2명 검색
		 * 
		 * 검색할 이름은? 박이
		 * "박이"로 시작하는 멤버는 없습니다.
		 * 
		 * 검색할 이름은? Q
		 * 검색을 종료합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		String searchName = "";
		int count = 0;
		
		while(true) {
			boolean w = true;
			count = 0;
			
			System.out.println("검색할 이름은?");
			searchName = sc.nextLine();
			
			if(searchName.equals("q") || searchName.equals("Q")) {
				System.out.println("검색을 종료합니다.");
				break;
			}
			
			for(int i = 0; i < members.length; i++) {
				if(members[i].startsWith(searchName) == true) {
					w = false;
					count += 1;
					System.out.println((i + 1) + "번쨰: " + members[i]);
				}
				
			}
			

			System.out.println("총: " + count + "명");
			
			
			
			if(w == true) {
				System.out.println(searchName + "로 시작하는 멤버는 없습니다.");
			}
			
		}
		
		
		sc.close();
		
	}

}
