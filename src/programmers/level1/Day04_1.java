package programmers.level1;

import java.util.Arrays;

// 배열의 평균값
public class Day04_1 {
    static class Solution {
        public double solution(int[] numbers) {
            double answer = 0;

            for (int i = 0; i < numbers.length; i++) {
                answer = answer + numbers[i];
            }
            return answer / numbers.length;

            // 다른 사람 풀이
//            return Arrays.stream(numbers).average().orElse(0);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // TEST
        double result = sol.solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99});
        System.out.println("result = " + result);
    }
}
