package DAY0322;

class oper{
	static public int sum(int a, int b) {
		return a + b;
	}
	
	static public double sum(double a, double b) {
		return a + b;
	}
	
	static public String sum(String a, String b) {
		return a + b;
	}
	
	//Variable Argument
	static public int hap(int ...n) { //갯수제한이 없음
		System.out.println("전달받은 숫자의 갯수: " + n.length);
		int s = 0;
		for(int i = 0; i < n.length; i++) {
			System.out.printf("%10d", n[i]);
			s+=n[i];
		}
		System.out.println();
		return s;
	}
	
	static public void writeColor(String ...color) {
		System.out.println("총 " + color.length + "개의 색상 전달받음");
		for(int i = 0; i < color.length; i++) {
			System.out.println(i + ": " + color[i]);
		}
		System.out.println("=".repeat(20));
	}
}

public class Ex4_Overloading {
	
	public static void main(String[] args) {
		
		System.out.println(oper.sum(5, 100));
		
		System.out.println(oper.sum(1.2, 5.6));
		
		System.out.println(oper.sum("apple", "banana"));
		
		System.out.println(oper.hap(1, 2, 5, 100, 2000, 30000, 2212321));
		
		oper.writeColor("red\n", "yellow\n", "black\n", "pink\n", "brown");
		
	}

}
