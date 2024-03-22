package DAY0322;

class MyShop{
	
	private String sangpum;
	private int su; 
	private int dan;
	private static String message; //공유되는 값
	
	public final static String SHOP = "24시간 이마트";

	public String getSangpum() {
		return sangpum;
	}

	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		MyShop.message = message;
	}
	
	//상품명, 수량, 단가를 한 번에 변경하고 싶을 경우
	public void setData(String sangpum, int su, int dan) {
		//메서드 안에서 같은 멤버 메서드는 this로 호출 가능
		this.setSangpum(sangpum);
		this.setSu(su);;
		this.setDan(dan);
	}
	//오버로딩 메서드: 메서드명은 같으나 인자가 달라야 함
	public void setData(String sangpum, int su, int dan, String message) {
		//메서드 안에서 같은 멤버 메서드는 this로 호출 가능
		this.setSangpum(sangpum);
		this.setSu(su);;
		this.setDan(dan);
		//인스턴스 메서드에서 static 메서드 호출 가능
		setMessage(message); // 같은 클래스이기 때문에 클래스명 생략
		//반대로 static 메서드에서 인스턴스 멤버 메서드는 호출 불가능
		//static 메서드에서 같은 static 메서드는 호출 가능
	}
	
	//출력은 getter가 아닌 일반 멤버 메서드로
	public void writeData() {
		System.out.println("상품명: " + sangpum);
		System.out.println("수량: " + su + " 단가: " + dan);
		System.out.println("총금액: " + su * dan);
		System.out.println("오늘의 메세지: " + message);
		System.out.println("=".repeat(20));
	}
	
}

public class Ex3_StaticMethod {
	
	public static void main(String[] args) {
		
		MyShop ms1 = new MyShop();
		MyShop ms2 = new MyShop();
		MyShop ms3 = new MyShop();
		
		System.out.println("** 상품1 **");
		ms1.setSangpum("딸기");
		ms1.setSu(3);
		ms1.setDan(2300);
		MyShop.setMessage("오늘 각종 과일 세일한다 ㅋ");
		
		ms1.writeData();
		
		System.out.println("** 상품2 **");
		ms2.setData("수박", 2, 30000);
		ms2.writeData();
		
		System.out.println("** 상품3 **");
		ms3.setData("참외", 5, 2000, "오늘 세일 마감임 ㅠㅠ ㅋ");
		ms3.writeData();
		
		System.out.println("** 상품1 다시 **");
		ms1.writeData();
		
		System.out.println("** 상품2의 수량만 변경");
		ms2.setSu(5);
		ms2.writeData();
		
	}

}
