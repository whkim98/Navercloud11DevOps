package DAY0326;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 예제.txt를 읽어서 총갯수와 총점, 평균을 구하시오
 * 단, 점수에 문자가 있는경우 갯수에서 제외하고 총점에서도 제외하고 출력이 되도록 하기
 */

public class Q1_Exception {
	
	static final String FILENAME2 = "/Users/uhyeonge/Desktop/navercloud/workall/naver0314File/0326예제용메모.txt";
	static int count = 0;
	static int sum = 0;
	static double avg = 0;
	
	static public void readMemo() {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(FILENAME2);
			br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				try {
				int su = Integer.parseInt(line);
				System.out.println(su);
				count = count + 1;
				sum = sum + su;
				
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("=".repeat(30));
			avg = (double)sum / count;
			System.out.println("총 갯수: " + count);
			System.out.println("총 점수: " + sum);
			System.out.printf("평균: %.1f", avg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		readMemo();
		
	}

}
