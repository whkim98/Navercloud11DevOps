package DAY0314;

public class Test2 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int su = 0;

        while (n > 0) {
            if (n % a != 0) {
                n -= b;
                su++;
            } else {
                n /= a;
                answer += su;
                su = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        int result = t2.solution(3, 1, 20);
        System.out.println(result); // 예상 결과값: 6
    }
}
