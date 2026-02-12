package programmers.level1;

public class Day01_1 {
    static class Solution {
        public int solution(int num1, int num2) {
            int answer = num1-num2;
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // test
        int result = sol.solution(10, 5);
        System.out.println("result = " + result);
    }
}
