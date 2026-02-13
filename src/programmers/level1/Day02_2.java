package programmers.level1;

// 숫자 비교하기
public class Day02_2 {
    static class Solution {
        public int solution(int num1, int num2) {
            int answer = (num1 == num2) ? 1 : -1;
            // 두 수가 같으면 1
            // 다르면 -1
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
