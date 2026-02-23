package programmers.level1;

import java.util.stream.IntStream;

// 나머지가 1이 되는 수 찾기
public class Day05_3 {
    static class Solution {
        public int solution(int n) {
            // 다른 사람 풀이
            for (int x = 2; x < n; x++) {   // x는 자연수, 1은 항상 나머지 0이라 제외
                if (n % x == 1) {
                    return x;              // 가장 작은 x
                }
            }
            return 0;

            // 다른 사람 풀이
//            return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);

        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // TEST
        int result = sol.solution(10);
        System.out.println("result = " + result);
    }
}
