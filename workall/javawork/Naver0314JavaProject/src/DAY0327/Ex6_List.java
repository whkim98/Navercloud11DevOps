package DAY0327;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex6_List {
	
	public static void main(String[] args) {
		
		List<String> list1 = new Vector<>();
//		List<String> list2 = new Vector<>(5); //5개가 넘을 경우 2배인 10개로 할당값 변경
		List<String> list2 = new Vector<>(5, 3); //5개가 넘을 경우 3개씩 늘어나서 8개가 됨
		
		System.out.println("list1의 데이터 갯수: " + list1.size());
		System.out.println("list1의 할당 갯수: " + ((Vector<String>)list1).capacity()); //capacity는 오버라이드 메서드가 아니기 때문에 형변환이 필요함
		System.out.println("list2의 데이터 갯수: " + list2.size());
		System.out.println("list2의 할당 갯수: " + ((Vector<String>)list2).capacity());
		
		String[] str = {"red", "blue", "green", "white", "red", "yellow", "pink"};
		for(String s: str) {
			list1.add(s);
			list2.add(s);
		}
		
		System.out.println("=".repeat(30));
		System.out.println("list1의 데이터 갯수: " + list1.size());
		System.out.println("list1의 할당 갯수: " + ((Vector<String>)list1).capacity()); 
		System.out.println("list2의 데이터 갯수: " + list2.size());
		System.out.println("list2의 할당 갯수: " + ((Vector<String>)list2).capacity());
		
		System.out.println("=".repeat(30));
		
		for(int i = 0; i < list1.size(); i++) {
		System.out.print(list1.get(i) + "\t");
		}
		
		System.out.println();
		System.out.println("=".repeat(30));
		
		for(String s: list1) {
			System.out.print(s + "\t");
		}
		
		System.out.println();
		System.out.println("=".repeat(30));
		
		Iterator<String> iter = list1.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + "\t");
		}
		
		System.out.println();
		System.out.println("=".repeat(30));
		
		Object[] ob = list1.toArray();
		for(Object s: ob) {
			System.out.print((String)s + "\t");
		}
		
	}

}
