package DAY0325;

class Member{
	private String memberName;
	private int memberCount;
	
	public Member() {
		
		this("동창회", 10);
		
	}
	
	Member(String memberName, int memberCount){
		this.memberName = memberName;
		this.memberCount = memberCount;
	}
	
	public void writeMember() {
		System.out.println("모임이름: " + memberName);
		System.out.println("모임정원: " + memberCount);
	}
}

class subMember extends Member{
	private String myName;
	private int myAge;
	
	subMember(){
		myName = "이름없음";
		myAge = 20;
	}
	
	subMember(String memberName, int memberCount, String myName, int myAge){
		super(memberName, memberCount);
		this.myName = myName;
		this.myAge = myAge;
	}
	
	@Override
	public void writeMember() {
		super.writeMember();
		System.out.println("내 이름: " + myName);
		System.out.println("내 나이: " + myAge);
		System.out.println("=".repeat(30));
	}
}

public class Ex6_Inherit {
	
	public static void main(String[] args) {
		
		subMember s = new subMember();
		s.writeMember();
		subMember s2 = new subMember("701모임", 40, "김우형", 27);
		s2.writeMember();
		
	}

}
