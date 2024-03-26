package DAY0326;

interface StudyInter{
	public void javaStudy();
	public void springStudy();
}

interface PlayInter{
	public void run();
	public void game();
}

class MyStudy implements StudyInter{
	@Override
	public void javaStudy() {
		System.out.println("자바공부 ㄱㄱ");
	}
	
	@Override
	public void springStudy() {
		System.out.println("스프링 공부 ㄱㄱ");
	}
}

class MyPlay implements PlayInter{
	@Override
	public void run() {
		System.out.println("RUN");
	}
	
	@Override
	public void game() {
		System.out.println("GAME");
	}
}

public class Ex6_Interface {
	
	public static void main(String[] args) {
		
		StudyInter si = new MyStudy();
		si.javaStudy();
		si.springStudy();
		
		PlayInter pi = new MyPlay();
		pi.run();
		pi.game();
		
	}

}
