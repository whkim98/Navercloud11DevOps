package DAY0326;

import java.util.Scanner;

abstract class Command{
	abstract public void process();
}

class List extends Command{
	@Override
	public void process() {
		System.out.println("데이터 목록을 출력합니다");
	}
}

class Delete extends Command{
	@Override
	public void process() {
		System.out.println("데이터 항목을 삭제합니다");
	}
}

class Insert extends Command{
	@Override
	public void process() {
		System.out.println("데이터를 추가합니다");
	}
}

class Update extends Command{
	@Override
	public void process() {
		System.out.println("데이터를 변경합니다");
	}
}

public class Ex3_Abstract {
	
	public static void process(Command comm) {
		comm.process();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Command comm;
		
		while(true) {
			System.out.println("=".repeat(40));
			System.out.println("1. 추가 2. 삭제 3. 목록 4. 수정 5. 종료");
			System.out.println("=".repeat(40));
			int num = sc.nextInt();
			if(num == 5) {
				System.out.println("DB 작업을 종료합니다");
				break;
			}
			
			switch(num) {
			case 1:
				comm = new Insert();
				comm.process();
				break;
			case 2:
				comm = new Delete();
				comm.process();
				break;
			case 3:
				comm = new List();
				comm.process();
				break;
			case 4:
				comm = new Update();
				comm.process();
				break;
			default :
				System.out.println("잘못된 입력");
			}
			
			
		}
		
		sc.close();
		
	}

}
