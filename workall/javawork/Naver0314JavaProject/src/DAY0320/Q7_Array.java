package DAY0320;

import java.util.Scanner;

public class Q7_Array {
	
	public static void main(String[] args) {
		
		/*
		 * 처음에 인원수(inwon)를 입력받은 후 해당 인원수만큼
		 * name, kor, eng, tot, rank 변수를 배열할당하고
		 * 인원수만큼 이름, 국어점수, 영어점수를 입력하면
		 * 총점과 등수를 계산해서 출력하는 프로그램 작성
		 * 
		 * 출력
		 * ==================================
		 * 번호	이름  국어  영어  총점  등수
		 * ==================================
		 * 1	강호동 90	  100  190   1
		 * 2	이영자 100  70   170	 3
		 * 3	유재석 90  90    180	 2
		 */
		
		Scanner sc = new Scanner(System.in);
		int inwon = 0;
		int[] kor = {};
		int[] eng = {};
		int[] tot = {};
		int[] rank = {};
		
		String[] name = {};
		
		
		System.out.println("인원수를 입력하세요");
		inwon = sc.nextInt();
		kor = new int[inwon];
		eng = new int[inwon];
		tot = new int[inwon];
		rank = new int[inwon];
		name = new String[inwon];
		
		for(int i = 0; i < inwon; i++) {
			System.out.println("이름을 입력하세요");
			name[i] = sc.next();
			System.out.println("국어점수를 입력하세요");
			kor[i] = sc.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng[i] = sc.nextInt();
			
			tot[i] = kor[i] + eng[i];
		}
		
		for(int i = 0; i < tot.length; i++) {
			rank[i] = 1;
			
			for(int j = 0; j < tot.length; j++) {
				if(tot[i] < tot[j]) {
					rank[i]++;
				}
			}
		}
		
		
		System.out.println("=".repeat(45));
		System.out.println("번호\t이름\t국어\t영어\t총점\t등수");
		System.out.println("=".repeat(45));
		for(int i = 0; i < inwon; i++) {
			System.out.println((i + 1) + "\t" + name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + tot[i] + "\t" + rank[i]);
		}
		System.out.println("=".repeat(45));
		
	}

}
