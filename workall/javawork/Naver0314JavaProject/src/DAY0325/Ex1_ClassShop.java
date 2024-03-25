package DAY0325;

public class Ex1_ClassShop {
	
	public static void writeShop(Shop[] myShop) {
		for(int i = 0; i < myShop.length; i++) {
		System.out.println(i + "번째] 상품명: " + myShop[i].getSang() + " 수량: " + myShop[i].getSu() + " 단가: " + myShop[i].getDan());
		}
	}
	
	public static void showTitle() {
		System.out.println("제목");
	}
	
	public static void main(String[] args) {
		
		Shop[] myShop = new Shop[4]; //객체 배열 메모리 할당, 초기값은 null
		myShop[0] = new Shop();
		myShop[1] = new Shop("딸기");
		myShop[2] = new Shop(3, 2000);
		myShop[3] = new Shop("사과", 5, 3000);
		
		showTitle();
		writeShop(myShop);
		
		System.out.println();
		System.out.println("0번의 상품명, 수량, 단가 변경");
		myShop[0].setSang("포도");
		myShop[0].setSu(3);
		myShop[0].setDan(2000);
		
		System.out.println("1번의 상품명, 수량, 단가 변경");
		myShop[1].setSangpum("오렌지", 5, 12000);
		
		System.out.println("** 변경된 값으로 다시 출력 **");
		showTitle();
		writeShop(myShop);
		
	}

}
