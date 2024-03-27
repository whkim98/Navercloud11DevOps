package DAY0327;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex8_MemberList {
	
	List<MemberDTO> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	static final String FILENAME = "/Users/uhyeonge/Desktop/navercloud/workall/naver0314File/member.txt";
	
	public Ex8_MemberList() {
		memberReadFile();
	}
	
	//파일 읽기
	public void memberReadFile() {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			while(true) {
				String s = br.readLine();
				if(s == null) {
					break;
				}
				
				String[] a = s.split(", ");
				MemberDTO dto = new MemberDTO();
				dto.setName(a[0]);
				dto.setHp(a[1]);
				dto.setAddr(a[2]);
				dto.setBlood(a[3]);
				
				list.add(dto);
				
			}
			
			System.out.println("총 " + list.size() + "명의 정보");
			
		} catch (FileNotFoundException e) {
			System.out.println("읽어올 정보가 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			}catch(IOException | NullPointerException e) {
				e.printStackTrace();
			}
		}
	}
	
	//종료시 파일 저장
	public void memberFileSave() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME);
			for(MemberDTO dto: list) {
				String s = dto.getName() + ", " + dto.getHp() + ", " + dto.getAddr() + ", " + dto.getBlood() + "\n";
				fw.write(s);
			}
			System.out.println("총 " + list.size() + "개의 정보를 저장하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException | NullPointerException e) {
				e.printStackTrace();
			}
		}
	}
	
	//메뉴 선택
	public int getMenu() {
		int menu = 0;
		
		System.out.println("1. 멤버정보 추가");
		System.out.println("2. 멤버삭제");
		System.out.println("3. 전체 멤버 출력");
		System.out.println("4. 이름으로 검색");
		System.out.println("5. 번호로 검색");
		System.out.println("6. 저장 후 종료");
		System.out.println("=".repeat(30));
		
		try {
		menu = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("숫자로 입력해 주세요");
		}
		
		return menu;
	}
	
	//멤버 데이터 추가
	public void addMember() {
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("번호를 입력하세요");
		String hp = sc.nextLine();
		System.out.println("주소를 입력하세요");
		String addr = sc.nextLine();
		System.out.println("혈액형을 입력하세요");
		String blood = sc.nextLine();
		
		MemberDTO dto = new MemberDTO(name, hp, addr, blood);
		list.add(dto);
		
		System.out.println(list.size() + "번째 추가");
		
	}
	
	//멤버 삭제
	public void deleteMember() {
		/*
		 * 삭제할 이름을 입력 후 해당 이름에 해당하는 멤버 정보를 삭제
		 * 없을 경우 "xxx 님은 명단에 없습니다"
		 * 있을 경우 "xxx님의 정보를 삭제하였습니다"
		 */
		
		System.out.println("삭제할 이름을 입력해 주세요");
		String name = sc.nextLine();
		boolean f = false;
		for(int i = 0; i < list.size(); i++) {
			MemberDTO dto = list.get(i);
			if(name.equals(dto.getName())) {
				list.remove(i);
				f = true;
			}
				
		}
		if(f == true) {
			System.out.println(name + "님의 정보를 삭제하였습니다.");
		}else {
		System.out.println(name + "님은 명단에 없습니다");
		}
	}
	
	//전체 멤버 출력
	public void writeMember() {
		System.out.println("\t ** 전체 명단 ** \n");
		System.out.println("=".repeat(60));
		System.out.println("번호\t이름\t번호\t\t주소\t혈액형");
		System.out.println("=".repeat(60));
		for(int i = 0; i < list.size(); i++) {
			MemberDTO dto = list.get(i);
			System.out.println(i + 1 + "\t" + dto.getName() + "\t" + dto.getHp() + "\t" + dto.getAddr() + "\t" + dto.getBlood().toUpperCase() + "형");
		}
		System.out.println("=".repeat(60));
		
	}
	
	//이름검색
	public void searchName() {
		
		/*
		 * 검색할 이름 입력인데 성만 입력해도 해당 성을 가진 사람 출력
		 * 한 명도 없을 경우 "xxx 님은 명단에 없습니다"
		 * 
		 * 이름: xxx
		 * 번호: xxx
		 * 주소: xxx
		 * 혈액형: x
		 * ==================
		 * 이름: xxx
		 * 번호: xxx
		 * 주소: xxx
		 * 혈액형: x
		 * ==================
		 */
		
		System.out.println("검색할 이름을 입력해 주세요");
		String name = sc.nextLine();
		boolean f = false;
		
		for(int i = 0; i < list.size(); i++) {
			MemberDTO dto = list.get(i);
			if(dto.getName().startsWith(name)) {
				System.out.println("이름: " + dto.getName());
				System.out.println("번호: " + dto.getHp());
				System.out.println("주소: " + dto.getAddr());
				System.out.println("혈액형: " + dto.getBlood());
				System.out.println("=".repeat(30));
				f = true;
			}
		}
		
		if(f == false) {
			System.out.println(name + "님은 명단에 없습니다");
		}
		
	}
	
	//번호검색
	public void searchPhone() {
		System.out.println("검색할 번호 끝 4자리를 입력해 주세요");
		String hp = sc.nextLine();
		boolean f = false;
		
		for(int i = 0; i < list.size(); i++) {
			MemberDTO dto = list.get(i);
			if(dto.getHp().endsWith(hp)) {
				System.out.println("");System.out.println("이름: " + dto.getName());
				System.out.println("번호: " + dto.getHp());
				System.out.println("주소: " + dto.getAddr());
				System.out.println("혈액형: " + dto.getBlood());
				System.out.println("=".repeat(30));
				f = true;
			}
		}
		
		if(f == false) {
			System.out.println(hp + "번호를 가진 멤버는 명단에 없습니다");
		}
	}
	
	public static void main(String[] args) {
		
		Ex8_MemberList ex = new Ex8_MemberList();
		
		while(true) {
			int menu = ex.getMenu();
			
			switch(menu) {
			case 1:
				ex.addMember();
				break;
			case 2:
				ex.deleteMember();
				break;
			case 3:
				ex.writeMember();
				break;
			case 4:
				ex.searchName();
				break;
			case 5:
				ex.searchPhone();
				break;
			case 6:
				ex.memberFileSave();
				System.out.println("저장 후 종료합니다");
				System.exit(0);
			default:
				System.out.println("잘못된 입력입니다");
			}
		}
		
	}

}
