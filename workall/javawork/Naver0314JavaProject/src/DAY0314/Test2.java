package DAY0314;

import java.util.Arrays;

public class Test2 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int[] subArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(subArray);
            answer[i] = subArray[commands[i][2] - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = t2.solution(array, commands); 
        System.out.println(Arrays.toString(result));
    }
}
