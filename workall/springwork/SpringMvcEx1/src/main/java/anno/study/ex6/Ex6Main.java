package anno.study.ex6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex6Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("appex6.xml");
		ShopController shopCont = (ShopController)context.getBean("shopcont");
		shopCont.insert("에어팟맥스", 2, 600000);
		System.out.println("=".repeat(30));
		shopCont.delete("에어팟맥스");
		System.out.println("=".repeat(30));
		shopCont.update("에어팟맥스", 4, 660000);
		System.out.println("=".repeat(30));
		
	}

}
