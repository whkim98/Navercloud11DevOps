package study.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex3Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("appex3.xml");
		MyCart mc = (MyCart)context.getBean("cart");
		mc.showInfo();
	}

}
