package DAY0327;

public class StudentDTO {
	
	private String name;
	private int age;
	private int java;
	private int spring;
	private int html;
	
	public StudentDTO() {
		super();
	}

	public StudentDTO(String name, int age, int java, int spring, int html) {
		super();
		this.name = name;
		this.age = age;
		this.java = java;
		this.spring = spring;
		this.html = html;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}
	
	public int getTotal() {
		int tot = getJava() + getSpring() + getHtml();
		return tot;
	}
	
	public double getAvg() {
		double avg = (double)getTotal() / 3;
		return avg;
	}
	
	public String getGrade() {
		String grade = null;
		if(getAvg() >= 90) {
			grade = "*****";
		}else if(getAvg() >= 80) {
			grade = "****";
		}else if(getAvg() >= 70) {
			grade = "***";
		}else if(getAvg() >= 60) {
			grade = "**";
		}else {
			grade = "*";
		}
		
		return grade;
	}

}
