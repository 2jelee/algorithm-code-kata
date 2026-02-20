package programmers.level1;

// 짝수와 홀수
public class Day04_2 {
    static class Solution {
        public String solution(int num) {
            String answer = (num % 2 == 0) ? "Even" : "Odd" ;
            return answer;

            // 다른 사람 풀이
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // TEST
        String result = sol.solution(4);
        System.out.println("result = " + result);
    }
}
