package programmers.level1;

import java.util.stream.IntStream;

// 짝수의 합
public class Day03_3 {
    static class Solution {
        public int solution(int n) {
            int answer = 0;

            // 짝수를 모두 더해라.. 2로 나눴을때 나머지가 모두 0인 것들을 sum
            // 범위를 어떻게 알고 어떻게 더하지 => 범위: n
            // 만약 10이 주어진다면 절반이 짝수 -> 그 짝수들을 모두 더해 "등차수열"

            // 반복문 사용 시 시간복잡도 O(n)
            for (int i = 0; i <= n; i++) {
                if(i % 2 == 0){
                    answer = answer + i;
                }
            }

            return answer;

            // 등차수열 합 공식 사용 시 시간복잡도 O(1)
            /**
             * [공식]
             * k = n / 2         짝수 개수 구하기
             * 짝수 합 = k(k+1)    공식 적용
             */
//            int k = n / 2;
//            return k * (k + 1);

            // 다른 사람 풀이
//            return IntStream.rangeClosed(0, n)
//                    .filter(e -> e % 2 == 0)
//                    .sum();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // TEST
        int result = sol.solution(10);
        System.out.println("result = " + result);
    }
}
