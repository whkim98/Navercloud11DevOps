package study.ex2;

public class Student {
	private String schoolName;
	Myinfo myInfo;
	
	//MyInfo 정보는 생성자 주입
	public Student(Myinfo info) {
		// TODO Auto-generated constructor stub
		myInfo=info;
	}
	
	//학교명은 setter 주입
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void show()
	{
		System.out.println(myInfo);//toString 호출
		System.out.println("학교명 : "+schoolName);
	}
}