package DAY0326;

public class Car {
	
	Tire tire1 = new HanKookTire();
	Tire tire2 = new KumhoTire();
	
	void run() {
		tire1.roll();
		tire2.roll();
	}

}
