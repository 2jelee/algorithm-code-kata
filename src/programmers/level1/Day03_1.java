package programmers.level1;

// 두 수의 합 구하기
public class Day03_1 {
    static class Solution {
        public int solution(int num1, int num2) {
            double calc = (double) num1 / num2 * 1000;
            int answer = (int) Math.floor(calc);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // test
        int result = sol.solution(7, 3);
        System.out.println("result = " + result);
    }
}
