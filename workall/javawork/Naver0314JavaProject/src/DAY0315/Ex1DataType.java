package DAY0315;

public class Ex1DataType {

	public static void main(String[] args) {
		/*
		 * 2024. 03. 15 수업 두 번째 날
		 * 자바에서 주석처리 하는 방법
		 */
		//기본 자료형 공부
		//구역({})안에서 선언하는 변수는 자동 초기화가 되지 않으므로
		//초기값을 지정하거나 나중에 변수에 값을 전달해야 출력 가능
		
		boolean flag = true;
		boolean flag2;
		flag2 = false;
		
		System.out.println(flag);
		System.out.println(flag2);
		
		System.out.println(!flag); //!: 반대로 출력 (not의 의미)
		System.out.println(!flag2);
		
		// &&: 둘 다 true일 때만 true
		// ||: 둘 중 하나만 true라면 true
		
		System.out.println(flag && flag2); //false출력
		System.out.println(flag || flag2); //true 출력
		
		
		
	}
	
}
