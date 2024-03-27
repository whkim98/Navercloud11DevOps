package DAY0327;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex3_SetLotto {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> setLotto = new TreeSet<>();
		while(true) {
			System.out.println("로또를 구입할 금액을 입력하세요");
			int money = sc.nextInt();
			
			if(money == 0) {
				System.out.println("종료합니다");
				break;
			}
			
			for(int j = 0; j < money / 1000; j++) {
			
			if(money < 1000) {
				System.out.println("금액이 부족합니다");
				break;
			}
			
			for(int i = 0; i < money / 1000; i++) {
				
				//6개의 중복되지 않은 로또 숫자 구하기(1 ~ 45)
				setLotto.clear();
				
				while(true) {
					int n = (int)(Math.random() * 45) + 1;
					setLotto.add(n);
					if(setLotto.size() == 6) {
						break;
					}
				}
				
			}
			
			System.out.println(j + 1 + "회");
			for(int l: setLotto) {
				System.out.println(l);
			}
			System.out.println("=".repeat(30));
			
			}
			
		}
		
	}

}
