package DAY0327;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 1. 학생정보추가
 * 2. 학생정보삭제 > 이름으로 찾아서 삭제
 * 3. 전체출력 > 번호, 이름, 자바점수, 스프링점수, html점수, 총점, 평균, 등급 출력
 * 4. 평균값을 입력하면 그 평균이상의 학생들을 출력
 * 5. 이름으로 검색(포함검색) > contains
 * 6. 저장 후 종료
 */

public class Q1_Vector {
	
	List<StudentDTO> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	static final String FILENAME = "/Users/uhyeonge/Desktop/navercloud/workall/naver0314File/student.txt";
	
	public Q1_Vector() {
		studentReadFile();
	}
	
	public void studentReadFile() {
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
				StudentDTO dto = new StudentDTO();
				dto.setName(a[0]);
				dto.setAge(Integer.parseInt(a[1]));
				dto.setJava(Integer.parseInt(a[2]));
				dto.setSpring(Integer.parseInt(a[3]));
				dto.setHtml(Integer.parseInt(a[4]));

				list.add(dto);

			}

			System.out.println("총 " + list.size() + "명의 정보");

		} catch (FileNotFoundException e) {
			System.out.println("읽어올 정보가 없습니다.");
		} catch (IOException e) {
			
		}finally {
			try {
				br.close();
				fr.close();
			}catch(IOException | NullPointerException e) {
				
			}
		}
	}
	
	public void studentFileSave() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME);
			for(StudentDTO dto: list) {
				String s = dto.getName() + ", " + dto.getAge() + ", " + dto.getJava() + ", " + dto.getSpring() + ", " + dto.getHtml() + ", " + dto.getAvg() + ", " + dto.getTotal() + ", " + dto.getGrade() + "\n";
				fw.write(s);
			}
			System.out.println("총 " + list.size() + "개의 정보를 저장하였습니다.");
		} catch (IOException e) {
			
		}finally {
			try {
				fw.close();
			} catch (IOException | NullPointerException e) {
				
			}
		}
	}
	
	public void addStudent() {
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("자바 점수를 입력하세요");
		int java = Integer.parseInt(sc.nextLine());
		System.out.println("스프링점수를 입력하세요");
		int spring = Integer.parseInt(sc.nextLine());
		System.out.println("html점수를 입력하세요");
		int html = Integer.parseInt(sc.nextLine());
		
		StudentDTO dto = new StudentDTO(name, age, java, spring, html);
		list.add(dto);
	}
	
	public void deleteStudent() {
		System.out.println("삭제할 이름을 입력해 주세요");
		String name = sc.nextLine();
		boolean f = false;
		for(int i = 0; i < list.size(); i++) {
			StudentDTO dto = list.get(i);
			if(dto.getName().equals(name)) {
				list.remove(i);
				System.out.println(name + "님의 정보를 삭제합니다");
				f = true;
			}
		}
		
		if(f == false) {
			System.out.println(name + "님은 명단에 없습니다");
		}
	}
	
	public void writeStudent() {
		for(int i = 0; i < list.size(); i++) {
			StudentDTO dto = list.get(i);
			System.out.println("이름: " + dto.getName());
			System.out.println("나이: " + dto.getAge());
			System.out.println("자바점수: " + dto.getJava());
			System.out.println("스프링점수: " + dto.getSpring());
			System.out.println("html점수: " + dto.getHtml());
			System.out.println("총점: " + dto.getTotal());
			System.out.printf("평균: %.1f\n", dto.getAvg());
			System.out.println("등급: " + dto.getGrade());
			System.out.println("=".repeat(30));
		}
	}
	
	public void searchAvg() {
		
		System.out.println("평균값을 입력하세요");
		double avg = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < list.size(); i++) {
			StudentDTO dto = list.get(i);
			if(dto.getAvg() >= avg) {
				System.out.println("이름: " + dto.getName());
				System.out.println("나이: " + dto.getAge());
				System.out.println("자바점수: " + dto.getJava());
				System.out.println("스프링점수: " + dto.getSpring());
				System.out.println("html점수: " + dto.getHtml());
				System.out.println("총점: " + dto.getTotal());
				System.out.printf("평균: %.1f\n", dto.getAvg());
				System.out.println("등급: " + dto.getGrade());
				System.out.println("=".repeat(30));
			}
		}
		
	}
	
	public void searchName() {
		System.out.println("검색할 이름을 입력해 주세요");
		String name = sc.nextLine();
		boolean f = false;

		for(int i = 0; i < list.size(); i++) {
			StudentDTO dto = list.get(i);
			if(dto.getName().contains(name) == true) {
				System.out.println("이름: " + dto.getName());
				System.out.println("나이: " + dto.getAge());
				System.out.println("자바점수: " + dto.getJava());
				System.out.println("스프링점수: " + dto.getSpring());
				System.out.println("html점수: " + dto.getHtml());
				System.out.println("총점: " + dto.getTotal());
				System.out.printf("평균: %.1f\n", dto.getAvg());
				System.out.println("등급: " + dto.getGrade());
				System.out.println("=".repeat(30));
				f = true;
			}
		}

		if(f == false) {
			System.out.println(name + "님은 명단에 없습니다");
		}

	}
	
	public int getMenu() {
		int menu = 0;

		System.out.println("1. 멤버정보 추가");
		System.out.println("2. 멤버삭제");
		System.out.println("3. 전체 멤버 출력");
		System.out.println("4. 평균값 입력");
		System.out.println("5. 이름으로 검색");
		System.out.println("6. 저장 후 종료");
		System.out.println("=".repeat(30));

		try {
			menu = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("숫자로 입력해 주세요");
		}

		return menu;
	}


	
	public static void main(String[] args) {
		
		Q1_Vector ex = new Q1_Vector();

		while(true) {
			int menu = ex.getMenu();

			switch(menu) {
			case 1:
				ex.addStudent();
				break;
			case 2:
				ex.deleteStudent();
				break;
			case 3:
				ex.writeStudent();
				break;
			case 4:
				ex.searchAvg();
				break;
			case 5:
				ex.searchName();
				break;
			case 6:
				ex.studentFileSave();
				System.out.println("저장 후 종료합니다");
				System.exit(0);
			default:
				System.out.println("잘못된 입력입니다");
			}
		}
		
	}

}
