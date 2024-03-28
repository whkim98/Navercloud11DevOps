package DAY0328;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Ex3_LambdaForEach {
	
	public static void main(String[] args) {
		
		List<String> list1 = new Vector<>();
		list1.add("빨강");
		list1.add("노랑");
		list1.add("분홍");
		list1.add("초록");
		
		for(String s: list1) {
			System.out.println(s);
		}
		System.out.println("=".repeat(30));
		
		List<String> list2 = Arrays.asList("장미꽃", "다알리아", "칸나", "안개꽃", "프리지아");
		list2.forEach(s->System.out.println(s));
		
	}

}
