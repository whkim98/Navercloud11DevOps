package DAY0314;

import java.util.Arrays;

public class Test2 {
	
	public int solution(String s) {
        int answer = 0;
        
        char ch = s.charAt(0);
        
        answer = Integer.parseInt(s);
        
        if(ch == '-') {
        	answer = answer;
        }
        
        System.out.println(answer);
        
        return answer;
    }
    
    public static void main(String[] args) {
    	
    	Test2 t2 = new Test2();
    	t2.solution("-1234");
        
    }
}
