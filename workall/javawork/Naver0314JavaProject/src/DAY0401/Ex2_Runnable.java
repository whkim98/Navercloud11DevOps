package DAY0401;

public class Ex2_Runnable implements Runnable{
	
	private String threadName;
	private int count;
	
	public Ex2_Runnable(String threadName, int count) {
		this.threadName = threadName;
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println(threadName + ": " + i);
		}
	}
	
	public static void main(String[] args) {
		
		Ex2_Runnable a = new Ex2_Runnable("1번", 300);
		Ex2_Runnable b = new Ex2_Runnable("2번", 300);
		Ex2_Runnable c = new Ex2_Runnable("3번", 300);
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(c);
		
		t1.start();
		t2.start();
		t3.start();
		
	}


}
