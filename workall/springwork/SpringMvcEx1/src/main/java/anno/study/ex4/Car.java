package anno.study.ex4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//@Component
//public class Car {
//	@Value("아우디")
//	private String carName;
//	@Autowired
//	private KoreaTire tire;
//	
////	public Car(Tire tire) {
////		this.tire = tire;
////	}
////	
////	public void setCarName(String carName) {
////		this.carName = carName;
////	}
//	
//	public void carInfo() {
//		System.out.println("자동차명: " + carName);
//		System.out.println("타이어: " + tire.getTireName());
//	}
//
//}

@Component
@RequiredArgsConstructor
public class Car {
	@Value("아우디")
	private String carName;

	@NonNull
	private KoreaTire tire;

	public void carInfo() {
		System.out.println("자동차명: " + carName);
		System.out.println("타이어: " + tire.getTireName());
	}
	
}
