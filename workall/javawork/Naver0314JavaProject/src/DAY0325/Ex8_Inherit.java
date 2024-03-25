package DAY0325;

class Animal{
	public void writeAnimal() {
		System.out.println("Animal 부모클래스");
	}
}

class Cat extends Animal{
	@Override
	public void writeAnimal() {
		super.writeAnimal();
		System.out.println("고양이임");
	}
	
	public void play() {
		System.out.println("야옹 ㅋㅋ");
	}
}

class Dog extends Animal{
	@Override
	public void writeAnimal() {
		super.writeAnimal();
		System.out.println("강아지임");
	}
	
	public void play() {
		System.out.println("멍멍 ㅋㅋ");
	}
}

public class Ex8_Inherit {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.writeAnimal();
		cat.play();
		
		Dog dog = new Dog();
		dog.writeAnimal();
		dog.play();
		
		System.out.println("=".repeat(20));
		
		//부모클래스로 선언, 자식클래스로 생성
		//다형성
		//오버라이드 메서드에 한해서만 호출 가능
		Animal ani = null;
		ani = new Cat();
		ani.writeAnimal();
//		ani.play(); // 에러나옴
		
		ani = new Dog();
		ani.writeAnimal();
		
	}

}
