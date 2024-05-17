package anno.study.ex5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Sawon {

	@Value("김우형")
	private String name;
	@Value("용인")
	private String addr;
	@Value("27")
	private int age;
	
}
