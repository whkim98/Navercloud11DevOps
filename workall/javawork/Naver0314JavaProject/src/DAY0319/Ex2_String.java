package DAY0319;

import java.util.StringTokenizer;

public class Ex2_String {

	public static void main(String[] args) {
		
		System.out.println("** String 객체의 Method 공부하기 **");
		
		String str1 = "Have a Nice Day";
		String str2 = "apple";
		String str3 = "Apple";
		System.out.println(str3.length());
		System.out.println(str1.charAt(7));
		System.out.println(str1.charAt(0));
		
		System.out.println("=".repeat(35));
		
		System.out.println(str1.indexOf('N')); // 첫 번째 위치에 있는 a
		System.out.println(str1.indexOf('X')); // 없는 글자는 -1 출력
		System.out.println(str1.lastIndexOf('a')); // 마지막 a의 위치
		
		System.out.println("=".repeat(35));
		
		System.out.println(str1.length()); // 총 길이
		
		System.out.println("=".repeat(35));
		
		System.out.println(str1.concat(" ^_^")); // 문자열 더하기
		System.out.println(str1 + " ^_^");
		
		System.out.println("=".repeat(35));
		
		System.out.println(str1.toLowerCase()); // 문자열 모두 소문자
		System.out.println(str1.toUpperCase()); // 문자열 모두 대문자
		
		System.out.println("=".repeat(35));
		
		//문자열 비교시(값으로 비교시 equals 사용
		System.out.println("apple".equals(str2));
		System.out.println("apple".equals(str3));
		System.out.println(str2.equals(str3)); // 대소문자가 달라서 false
		System.out.println(str2.equalsIgnoreCase(str3)); // 대소문자 상관없이 비교
		
		System.out.println("=".repeat(35));
		
		System.out.println(str1.hashCode()); // 문자열의 주소값 출력
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println(str2 == str3); //주소를 비교하기 때문에 false 출력

		System.out.println("=".repeat(35));
		
		//문자열 추출
		System.out.println(str1.substring(7)); // 7번 인덱스부터 끝까지
		System.out.println("substring: " + str1.substring(0, 5)); //0번째부터 4번째 문자 출력

		System.out.println("=".repeat(35));
		
		//비교
		System.out.println(str1.startsWith("Have")); // Have로 시작이 맞다면 true, 틀리면 false
		System.out.println(str1.startsWith("Nice"));

		System.out.println("=".repeat(35));
		
		System.out.println(str1.endsWith("Day")); // Day로 끝나는게 맞다면 true, 틀리면 false
		System.out.println(str1.endsWith("day")); // 대소문자 구문해야 함
		
		System.out.println("=".repeat(35));
		
		System.out.println(str1.toLowerCase().endsWith("day")); // 소문자로 바꾸고 day로 끝남? true
		
		System.out.println("=".repeat(35));
		
		System.out.println(str2.compareTo("apple")); //완전 똑같으면 0
		System.out.println(str2.compareTo("append"));
		System.out.println(str2.compareTo("banana"));
		
		System.out.println("=".repeat(35));
		
		//변경
		System.out.println(str1.replace('a', '*')); //a를 *로 변경
		System.out.println(str1.replace("Have a Nice Day", "캬캬캬ㅑㅋ")); 
		
		System.out.println("=".repeat(35));
		
		//문자열 분리(결과는 배열값)
		String colors = "red, blue, green, yellow, pink";
		String []a1 = colors.split(", ");
		System.out.println(colors);
		System.out.println("분리된 배열의 갯수: " + a1.length);
		System.out.println(a1[0] + ", " + a1[4]);
		
		System.out.println("=".repeat(35));
		
		//분리하는 또 다른 방법
		StringTokenizer st = new StringTokenizer(colors, ", ");
		System.out.println("분리된 토큰 수: " + st.countTokens());
		
		//분리된 토큰값 출력
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()); //다음 토큰을 꺼내서 출력
		}
		
		System.out.println("=".repeat(35));
		
		String msg = "   hello   ";
		System.out.println(msg.length());
		System.out.println(msg.trim().length()); //양쪽 공백 제거 후 길이
		
		System.out.println("=".repeat(35));
		
		//valueOf: 어떤 타입의 데이터든 모두 String으로 변환
		System.out.println(String.valueOf(3)); // 정수 3이 문자열 "3"으로 반환
		System.out.println(3 + ""); // 이것도 문자열임(어디든 문자열과 합쳐지면 문자열로 반환됨)
		
		System.out.println("=".repeat(35));
		
		System.out.println(str1.isEmpty());
		System.out.println("".isEmpty());
		
		System.out.println("=".repeat(35));
		
	}
	
}
