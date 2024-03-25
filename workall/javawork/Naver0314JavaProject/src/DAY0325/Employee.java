package DAY0325;

public class Employee {
	
	private String name;
	private String position;
	private int age;
	private int gibon;
	private int sudang;
	
	public Employee() {
		
	}
	
	public Employee(String name, String position, int age) {
		this.name = name;
		this.position = position;
		this.age = age;
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGibon() {
		return gibon;
	}

	public void setGibon(int gibon) {
		this.gibon = gibon;
	}

	public int getSudang() {
		return sudang;
	}

	public void setSudang(int sudang) {
		this.sudang = sudang;
	}

	public void setPay(int gibon, int sudang) {
		this.gibon = gibon;
		this.sudang = sudang;
	}

	public void setSawon(String name, String position, int age) {
		this.name = name;
		this.position = position;
		this.age = age;
	}

	public int getNetPay(int gibon, int sudang) {
		int netPay = gibon + sudang;
		return netPay;
	}
	
	

}
