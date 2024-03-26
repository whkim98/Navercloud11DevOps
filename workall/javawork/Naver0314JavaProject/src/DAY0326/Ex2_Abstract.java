package DAY0326;

abstract class AbsEx1{
	abstract public void play();
}

abstract class AbsEx2 extends AbsEx1{
	@Override
	public void play() {
		System.out.println("게임을 시작합니다");
	}
	
	abstract public void study();
}

class AbsEx3 extends AbsEx2{
	@Override
	public void play() {
		super.play();
		System.out.println("야구 게임을 합니다");
	}
	
	@Override
	public void study() {
		System.out.println("공부를 합니다");		
	}
}

public class Ex2_Abstract {
	
	public static void main(String[] args) {
		
		AbsEx2 abs = new AbsEx3();
		abs.play();
		abs.study();
		
	}

}
