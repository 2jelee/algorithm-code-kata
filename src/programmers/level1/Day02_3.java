package programmers.level1;

// 두 수의 합 구하기
public class Day02_3 {
    static class Solution {
        public int solution(int num1, int num2) {
            int answer = num1 + num2;
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // test
        int result = sol.solution(2, 3);
        System.out.println("result = " + result);
    }
}
