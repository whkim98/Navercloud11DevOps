package DAY0326;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex15_FileReader {
	
	static final String FILENAME2 = "/Users/uhyeonge/Desktop/navercloud/workall/naver0314File/memo2.txt";
	
	static public void readMemo2(){
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(FILENAME2);
			System.out.println("** memo2 파일을 읽습니다 **");
			br = new BufferedReader(fr);
			while(true) {
				//파일의 내용을 한 줄씩 읽어온다
				String line = br.readLine();
				//만약 더이상 데이터가 없을 경우 null이 나옴
				if(line == null) {
					System.out.println("파일을 끝까지 읽었습니다.");
					break;
				}
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("** memo2 파일이 없습니다 **" + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close(); //늦게 열린 걸 먼저 닫아줌
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		readMemo2();
		
	}

}
