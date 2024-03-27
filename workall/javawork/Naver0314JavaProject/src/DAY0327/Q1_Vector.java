package DAY0327;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 * 1. 이름추가 2. 이름삭제 3. 이름출력 4. 이름검색 5. 저장 & 종료
 * 
 * 종료시 파일에 저장
 * 처음 생성시 파일에서 읽어올 것
 */

public class Q1_Vector {
	
	Scanner sc = new Scanner(System.in);
	
	List<String> list = new Vector<>();
	
	static final String FILENAME = "/Users/uhyeonge/Desktop/navercloud/workall/naver0314File/person.txt";
	
	public Q1_Vector() {
		//파일을 읽어 list에 저장된 이름 추가하기
		try {
			personRead();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("얽어올 명단이 없습니다");
		}
	}
	
	public void personRead() throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			while(true) {
				String name = br.readLine();
				if(name == null) {
					break;
				}
				list.add(name);
			}
			System.out.println("총 " + list.size() + "명의 멤버를 파일에서 읽습니다");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("읽어올 명단이 없습니다");
		}finally {
			if(br != null) br.close();
			if(fr != null) fr.close();
		}
	}
	
	public void personSave() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME);
			for(String s: list) {
				fw.write(s + "\n");
			}
			System.out.println("총 " + list.size() + "명의 명단을 저장합니다");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	
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
			v.personSave();
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
