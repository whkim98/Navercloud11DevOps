package DAY0326;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex14_FileException {
	
	static final String FILENAME = "/Users/uhyeonge/Desktop/navercloud/workall/naver0314File/memo1.txt";
	static final String FILENAME2 = "/Users/uhyeonge/Desktop/navercloud/workall/naver0314File/memo2.txt";
	
	static public void fileSave() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(FILENAME);
			fw.write("이름: 유재석\n");
			fw.write("나이: 20세\n");
			fw.write("주소: 강남구\n");
			System.out.println("파일을 확인하세요");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static public void fileSave2() throws IOException{
		Scanner sc = new Scanner(System.in);
		String name;
		String hp;
		String addr;
		while(true) {
			FileWriter fw = null;
			fw = new FileWriter(FILENAME2, true);
			System.out.println("이름을 입력하세요(x입력시 종료)");
			name = sc.nextLine();
			if(name.equalsIgnoreCase("x")) {
				System.out.println("종료합니다");
				System.exit(0);
			}
			System.out.println("번호를 입력하세요");
			hp = sc.nextLine();
			System.out.println("주소를 입력하세요");
			addr = sc.nextLine();
			System.out.println("입력한 정보를 파일에 저장합니다");
			
			fw.write("이름: " + name + "\n");
			fw.write("번호: " + hp + "\n");
			fw.write("주소: " + addr + "\n");
			fw.write("=".repeat(30) + "\n");
			System.out.println();
			fw.close();
		}
	}
	
	public static void main(String[] args) {
//		fileSave();
		try {
			fileSave2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
