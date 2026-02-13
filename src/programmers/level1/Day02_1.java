package programmers.level1;

// 나이출력
public class Day02_1 {
    static class Solution {
        public int solution(int age) {
            int answer = (2022 + 1) - age;
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // test
        int result = sol.solution(40);
        System.out.println("result = " + result);
    }
}
