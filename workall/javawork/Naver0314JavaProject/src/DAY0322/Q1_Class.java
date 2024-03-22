package DAY0322;

class Member{
	private String name;
	private String hp;
	private String addr;
	
	Member(){
		
	}
	
	Member(String name){
		this.name = name;
	}
	
	Member(String name, String hp){
		this.name = name;
		this.hp = hp;
	}
	
	Member(String name, String hp, String addr){
		this.name = name;
		this.hp = hp;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}

public class Q1_Class {
	
	public static void writeMember(Member m) {
		System.out.println("이름: " + m.getName() + " 전화번호: " + m.getHp() + " 주소: " + m.getAddr());
	}
	
	public static void main(String[] args) {
		
		Member m1 = new Member();
		Member m2 = new Member("이강인");
		Member m3 = new Member("손흥민" , "010-2222-3333");
		Member m4 = new Member("Candy", "010-4444-5555", "제주도");
		
		System.out.println("** 멤버 명단 출력 **");
		writeMember(m1);
		writeMember(m2);
		writeMember(m3);
		writeMember(m4);
		
		System.out.println("\n** m1 멤버의 값 변경 **");
		m1.setName("이영자");
		m1.setHp("011-2323-6767");
		m1.setAddr("부산");
		
		writeMember(m1);
		
	}

}
