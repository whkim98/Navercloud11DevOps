package DAY0327;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex4_Map {
	
	public static void main(String[] args) {
		
		//Map: key와 value의 쌍으로 저장되는 형태
		//이때 key 타입이 Set이므로 중복된 데이터를 허용하지 않고 비순차적으로 들어감
		
		Map<String, String> map1 = new HashMap<>();
		map1.put("name", "김태희");
		map1.put("age", "35");
		map1.put("addr", "서울");
		map1.put("name", "한가인");
		
		System.out.println("map1의 갯수: " + map1.size());
		System.out.println(map1.get("name"));
		System.out.println(map1.get("age"));
		System.out.println(map1.get("addr"));
		System.out.println(map1.get("hp")); //없는 키값은 null 반환
		
		System.out.println(map1.keySet());
		
		Set<String> keys = map1.keySet();
		for(String k: keys) {
			String v = map1.get(k);
			System.out.println(k + ": " + v);
		}
		
	}

}
