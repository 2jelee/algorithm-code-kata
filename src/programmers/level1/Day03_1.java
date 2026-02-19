package programmers.level1;

// 두 수의 나눗셈
public class Day03_1 {
    static class Solution {
        public int solution(int num1, int num2) {
            double calc = (double) num1 / num2 * 1000;
            int answer = (int) Math.floor(calc);
            return answer;
            // 다른 사람 풀이
            // return num1 * 1000 / num2;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // TEST
        int result = sol.solution(7, 3);
        System.out.println("result = " + result);
    }
}
