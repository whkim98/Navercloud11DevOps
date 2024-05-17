package anno.study.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex4Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("appex4.xml");
		Hello h = (Hello)context.getBean("hello");
		h.showMessage();
	}

}
