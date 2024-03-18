package DAY0318;

public class Ex1_AsciiCode {

	public static void main(String[] args) {
		
		//char은 내부적으로 정수로 인식
		char a = 'A';
		char b = 65; //아스키코드로 65는 문자 'A'
		
		System.out.println((int)a);
		System.out.println(b);
		
		System.out.printf("a = %d, %c\n", (int)a, a);
		System.out.printf("b = %d, %c\n", (int)b, b);
		
		System.out.println(a + 3); //68, char + int = int
		System.out.println((char)(a + 3)); 
		System.out.println(a + 'A'); 
		
		char c = '7';
		System.out.println(c);
		System.out.println((int)c);
		
		System.out.println(c + 2);
		
		System.out.println(c - 48);
		
		int n1 = c - '0';
		int n2 = c - 48;
		
		System.out.println(n1);
		System.out.println(n2);
		
		System.out.println(n2 + 2);
		
		
		
	}
	
}
