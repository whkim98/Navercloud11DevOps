package DAY0327;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex1_Set {
	
	public static void main(String[] args) {
		
		/*
		 * Set 인터페이스를 구현한 클래스로는 TreeSet과 HashSet이 있다.
		 * Set타입의 특징
		 * 1. 중복데이터를 허용하지 않는다.
		 * 2. 입력한 순서대로 들어가지 않는다.(비순차적)
		 * 3. TreeSet은 오름차순으로 들어간다. HashSet은 지 맘대로 들어감
		 */
		
		//<Integer>: 해당 컬렉션에는 Integer타입만 넣을 수 있다.
//		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set1 = new TreeSet<>();
		set1.add(100);
		set1.add(78);
		set1.add(78);
		set1.add(100);
		set1.add(65);
		
		System.out.println("set1의 데이터 갯수: " + set1.size()); //중복데이터 제외
		
		System.out.println("** 출력1 **");
		for(int n: set1) {
			System.out.println(n);
		}
		
		System.out.println("** 출력2 **");
		Iterator<Integer> iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
