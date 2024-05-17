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
	
	public void showInfo() {
		System.out.println("쇼핑한 사람 이름: " + person.getName());
		System.out.println("쇼핑한 사람 핸드폰: " + person.getPhone());
		System.out.println("상품명: " + sangpum);
		System.out.println("상품 가격: " + price);
	}

}
