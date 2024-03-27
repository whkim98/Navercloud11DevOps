package DAY0327;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 * 1. 이름추가 2. 이름삭제 3. 이름출력 4. 이름검색 5. 종료
 */

public class Q1_Vector {
	
	Scanner sc = new Scanner(System.in);
	
	List<String> list = new Vector<>();
	
	//메뉴 선택시 번호 반환
	public int getMenu() {
		int menu = 0;
		System.out.println("=".repeat(50));
		System.out.println("1. 이름추가 2. 이름삭제 3. 이름출력 4. 이름검색 5. 종료");
		System.out.println("=".repeat(50));
		menu = Integer.parseInt(sc.nextLine());
		return menu;
	}
	
	public void addPerson() {
		
		System.out.println("이름을 입력해 주세요");
		String name = sc.nextLine();
		list.add(name);
		System.out.println(list.size() + "번째 추가");
		
	}
	
	public void deletePerson() {
		System.out.println("삭제할 이름을 입력해 주세요");
		String name = sc.nextLine();
		boolean f = list.remove(name);
		if(!f) {
			System.out.println(name + "님은 명단에 없습니다.");
		}else {
			System.out.println(name + "님을 명단에서 삭제했습니다");
		}
	}
	
	public void listPerson() {
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	public void searchPerson() {
		
		boolean f = false;
		
		System.out.println("검색할 이름을 입력하세요");
		
		String name = sc.nextLine();
		
		for(int i = 0; i < list.size(); i++) {
			String listName = list.get(i);
			if(listName.equals(name)) {
				f = true;
				System.out.println(name + "님은 " + (i + 1) + "번째에 있습니다");
			}
		}
		
		if(f == false) {
			System.out.println(name + "님은 명단에 없습니다");
		}
		
	}
	
	public static void main(String[] args) {
		
		Q1_Vector v = new Q1_Vector();
		
		while(true) {
		
		int menu = v.getMenu();
		
		if(menu == 5) {
			System.out.println("종료합니다ㅓ");
			break;
		}
		
		switch(menu) {
		case 1:
			v.addPerson();
			break;
		case 2:
			v.deletePerson();
			break;
		case 3:
			v.listPerson();
			break;
		case 4:
			v.searchPerson();
			break;
		default:
			System.out.println("잘못된 번호 입력");
			break;
		}
		
		}
		
	}

}
