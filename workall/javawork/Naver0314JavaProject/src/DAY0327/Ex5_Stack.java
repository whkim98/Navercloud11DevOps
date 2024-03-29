package DAY0327;

import java.util.Stack;

public class Ex5_Stack {
	
	public static void main(String[] args) {
		
		//List 인터페이스를 구현한 클래스 중 하나
		//LIFO방식: 먼저 들어간게 나중에 나오는 방식(후입선출)
		Stack<String> stack1 = new Stack<>();
		stack1.push("사과");
		stack1.push("사과");
		stack1.push("바나나");
		stack1.push("오렌지");
		stack1.push("파인애플");
		
		System.out.println("갯수: " + stack1.size());
		
		while(!stack1.empty()) {
			System.out.println(stack1.pop());
		}
		
	}

}
