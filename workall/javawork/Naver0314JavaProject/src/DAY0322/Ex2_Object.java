package DAY0322;

class Orange{
	//private 접근 지정자는 같은 클래스 내에서만 접근 가능
	private String name;
	private int age;
	private static String company = "삼성";
	
	//getter 메서드: 멤버변수값을 반환하는 메서드(규칙 getName, getAge)
	public String getName() {
		return this.name; //this: 자기 자신을 의미하는 인스턴스 변수(일반 멤버메서드에만 존재하고 static에는 존재하지 않음)
//		return name; //같은 구역 안에 같은 이름이 없을 경우에만 this생략 가능
	}
	
	public int getAge() {
		return this.age;
	}
	
	//외부로부터 값을 받아서 멤버변수의 값을 변경
	public void setName(String name) {
		this.name = name; //매개변수에 있는 name값을 멤버변수 name으로 전달
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//static변수를 반환하는 메서드
	public static String getCompany() {
		return company;
	}
	
}

public class Ex2_Object {
	
	public static void main(String[] args) {
		
		Orange o = new Orange();
		System.out.println(o.getName());
		System.out.println(o.getAge());
		
		System.out.println("이름과 나이 변경 후 출력");
		o.setName("김우형");
		o.setAge(27);
		System.out.println(o.getName());
		System.out.println(o.getAge());
		System.out.println(Orange.getCompany());
		
	}
	
}
