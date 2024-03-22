package DAY0322;

import java.util.Scanner;

//Call By Reference
public class Ex7_ClassSawonArray {
	
	//입력
	static public void inputSawonArray(Sawon[] sa) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("총 " + sa.length + "명의 사원정보를 입력하세요");
	    for(int i = 0; i < sa.length; i++) {
	        System.out.println("사원명은?");
	        String name = sc.nextLine();
	        System.out.println("기본급은?");
	        int gibon = Integer.parseInt(sc.nextLine());
	        System.out.println("수당은?");
	        int sudang = Integer.parseInt(sc.nextLine());
	        sa[i] = new Sawon(); 
	        sa[i].setSawon(name, gibon, sudang);
	        System.out.println();
	    }
	}

	
	//출력
	static public void outputSawonArray(Sawon[] sa) {
		System.out.println("[사원 급여 현황]\n");
		System.out.println("번호\t사원명\t기본급\t수당\t실수령액");
		System.out.println("=".repeat(60));
		for(int i = 0; i < sa.length; i++) {
			System.out.println((i + 1) + "\t" + sa[i].getName() + "\t" + sa[i].getGibon()
					+ "\t" + sa[i].getSudang() + "\t" + sa[i].getNetPay());
		}
	}
	
	public static void main(String[] args) {
		
		Sawon[] sawon = {};
		int inwon = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("직원 인원수 입력");
		inwon = Integer.parseInt(sc.nextLine());
		
		sawon = new Sawon[inwon];
		
		inputSawonArray(sawon);
		outputSawonArray(sawon);
		
	}

}
