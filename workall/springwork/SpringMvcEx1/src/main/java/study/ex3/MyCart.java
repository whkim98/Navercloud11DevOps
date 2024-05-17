package study.ex3;

public class MyCart {
	
	Person person;
	private String sangpum;
	private int price;
	
	public MyCart(String sangpum, int price) {
		this.sangpum = sangpum;
		this.price = price;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
