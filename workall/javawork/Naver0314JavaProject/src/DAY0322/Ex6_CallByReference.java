package DAY0322;

class Stu{
	String name = "이영자";
	String blood = "A";
	int age = 12;
}

public class Ex6_CallByReference {
	
	public static void changeStu(Stu s) {
		s.blood = "O";
		s.age = 34;
	}
	
	public static void main(String[] args) {
		
		Stu s = new Stu();
		System.out.println(s.name + ", " + s.blood + ", " + s.age);
		changeStu(s); //CallByReference: 주소전달
		System.out.println(s.name + ", " + s.blood + ", " + s.age);
		
		
	}

}
