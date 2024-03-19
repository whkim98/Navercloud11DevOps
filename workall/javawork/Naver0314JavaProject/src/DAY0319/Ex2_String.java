package DAY0319;

public class Ex2_String {

	public static void main(String[] args) {
		
		System.out.println("** String 객체의 Method 공부하기 **");
		
		String str1 = "Have a Nice Day";
		String str2 = "apple";
		String str3 = "Apple";
		
		System.out.println(str1.charAt(7));
		System.out.println(str1.charAt(0));
		
		System.out.println("=".repeat(35));
		
		System.out.println(str1.indexOf('a')); // 첫 번째 위치에 있는 a
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
		System.out.println(str1.substring(0, 5)); //0번째부터 4번째 문자 출력

		System.out.println("=".repeat(35));
		
		System.out.println(str1.startsWith("Have")); // Have로 시작이 맞다면 true, 틀리면 false
		System.out.println(str1.startsWith("Nice"));
		
	}
	
}
