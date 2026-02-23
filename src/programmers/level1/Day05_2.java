package programmers.level1;

// 약수의 합
public class Day05_2 {
    static class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n; i++) {
//                if(n % 2 == 0){ // <- 짝수인가?
                if(n % i == 0){ // <- 약수인가?
                    answer += i;
                }
            }

            return answer;

            // 다른 사람 풀이
//            for (int i = 1; i * i <= n; i++) {
//                if (n % i == 0) {
//                    answer += i;
//
//                    if (i != n / i) { // 중복 방지
//                        answer += n / i;
//                    }
//                }
//            }

        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // TEST
        int result = sol.solution(12);
        System.out.println("result = " + result);
    }
}
