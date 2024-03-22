package DAY0322;

class Student{
	private String name;
	private int kor, eng, tot;
	private double avg;
	
	Student(){
		this("이름미정",20,20);
	}
	
	Student(String name){
		this(name, 50, 60);
	}
	
	Student(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = kor + eng;
		this.avg = tot / 2.0;
	}
	
	public void disp() {
		System.out.println("이름: " + name);
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("총점: " + tot);
		System.out.println("평균: " + avg);
		System.out.println("=".repeat(30));
	}
}

public class Ex9_Constructor {
	
	public static void main(String[] args) {
		
		Student st = new Student("김우형", 100, 70);
		Student st2 = new Student();
		Student st3 = new Student("김우형");
		st.disp();
		st2.disp();
		st3.disp();
		
	}

}
