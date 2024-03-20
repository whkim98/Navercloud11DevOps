package DAY0320;

public class Q6_ArrayRank {
	
	public static void main(String[] args) {
		
		int[] score = {100, 90, 80, 90, 70};
		int[] rank = new int[5];
		
		/*
		 * 등수를 구하는데 동점일 경우 동순위를 부여
		 * 출력은
		 * 번호 점수 등수 순으로 출력
		 */
		
		for(int i = 0; i < score.length; i++) {
			rank[i] = 1;
			
			for(int j = 0; j < score.length; j++) {
				//상대방(j)점수가 더 크면 기준 등수 (i)의 값을 1 증가
				if(score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		
		System.out.println("번호\t점수\t\t등수");
		System.out.println("=".repeat(35));
		
		for(int a = 0; a < score.length; a++) {
			System.out.println("번호: " + (a + 1) + "\t점수: " + score[a] + "\t\t등수: " + rank[a]);
		}
		
	}

}
