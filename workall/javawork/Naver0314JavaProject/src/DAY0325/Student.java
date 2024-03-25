package DAY0325;

public class Student {
	
	private String name;
	private int java;
	private int spring;
	
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(int java, int spring) {
		this.java = java;
		this.spring = spring;
	}
	
	public Student(String name, int java, int spring) {
		this.name = name;
		this.java = java;
		this.spring = spring;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	public int getTotal() {
		return java + spring;
	}

	public double getAverage() {
		return (double)(java + spring) / 2;
	}


	public String getGrade(double average) {
		String grade = null;
		if(average >= 90) {
			grade = "A";
		}else if(average >= 80) {
			grade = "B";
		}else if(average >= 70) {
			grade = "C";
		}else {
			grade = "F";
		}
		return grade;
	}

	public void setScore(int java, int spring) {
		this.java = java;
		this.spring = spring;
	}
	
	

}
