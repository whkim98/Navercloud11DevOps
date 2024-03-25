package DAY0325;

public class AbstractMethodExample {
	
	public static void animalSound(Animal2 animal) {
		animal.sound();
	}
	
	public static void main(String[] args) {
		
		Dog2 dog = new Dog2();
		dog.sound();
		
		Cat2 cat = new Cat2();
		cat.sound();
		
		animalSound(new Dog2());
		animalSound(new Cat2());
		
	}

}
