package DAY0326;

//abstract 메서드는 오버라이드만을 목적으로 body({})없이 구현하고자 할 경우 
//앞에 abstract를 붙여서 추상 메서드로 만든다
//abstract메서드를 한 개 이상 포함하고 있는 클래스는 클래스 역시 추상화 시켜야 한다
//추상화하는 방법은 class 앞에 abstract를 붙이면 된다
//단, 추상 클래스는 그 자체로는 생성할 수 없다.
//추상클래스를 상속받는 서브 클래스는 반드시 추상 메서드를 오버라이드 해야만 하는데 
//만약 오버라이드 하지 않을 경우 서브클래스 역시 추상화한다

abstract class Animal{
//	public void sound() {
//		System.out.println("부모클래스는 하는 게 업슴");
//	}
	
	abstract public void sound();
	
	public void showTitle() {
		System.out.println("추상클래스 공부 중임 ");
	}
	
}

class Dog extends Animal{
	@Override
	public void sound() {
//		super.sound();
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	@Override
	public void sound() {
//		super.sound();
		System.out.println("야옹");
	}
}

class Chick extends Animal{
	@Override
	public void sound() {
//		super.sound();
		System.out.println("삐약");
	}
}

public class Ex1_Abstract {
	
	public static void Hello(Animal ani) {
		ani.showTitle();
		ani.sound();
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Hello(new Cat());
		Hello(new Dog());
		Hello(new Chick());
		
	}

}
