package DAY0325;

//8번에서 만든 Animal, Cat, Dog 클래스를 이용한 예제

//다형성처리에 대한 예제
public class Ex9_Inherit {
	
	public static void showAnimal(Animal ani){
		ani.writeAnimal(); //이때 ani는 cat이 되기도 하고 dog가 되기도 함(누가 생성돼서 넘어오느냐에 따라 다름)
	}
	
	public static void main(String[] args) {
		
		showAnimal(new Cat());
		showAnimal(new Dog());
		
	}

}
