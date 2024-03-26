package DAY0326;

abstract class Hello{
	abstract public void study();
}

interface Happy{
	public void insert();
	public void delete();
}

class Kiwi{
	Hello h = new Hello() {
		
		@Override
		public void study() {
			System.out.println("익명 내부 클래스");
		}
	};
	
	Happy ha = new Happy() {
		
		@Override
		public void insert() {
			System.out.println("데이터 추가");
		}
		
		@Override
		public void delete() {
			System.out.println("데이터 삭제");
		}
	};
}

public class Ex9_AnonyInner {
	
	public static void main(String[] args) {
		
		Kiwi k = new Kiwi();
		k.h.study();
		
		k.ha.insert();
		k.ha.delete();
		
	}

}
