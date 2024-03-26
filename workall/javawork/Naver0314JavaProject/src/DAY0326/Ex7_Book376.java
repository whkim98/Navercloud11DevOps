package DAY0326;

public class Ex7_Book376 {
	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tire1 = new HanKookTire();
		myCar.tire2 = new KumhoTire();
		
		myCar.run();
		
	}

}
