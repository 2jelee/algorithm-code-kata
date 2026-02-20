package programmers.level1;

import java.util.Arrays;

// 평균 구하기
public class Day04_3 {
    static class Solution {
        public double solution(int[] arr) {
            double answer = 0;

            for (int i = 0; i < arr.length; i++) {
                answer = answer + arr[i];
            }
            return answer / arr.length;

            // 다른 사람 풀이
//            return Arrays.stream(arr).average().getAsDouble();
            /**
             * [Day04_1 문제와 비교]
             * "getAsDouble()"
             * 1. 동작 방식
             * average()는 OptionalDouble을 반환함
             * 값이 있으면 getAsDouble()이 그 값을 반환 (빈 배열일 경우, 예외 발생 O)
             * 값이 없으면 NoSuchElementException 발생 (안정성 낮음)
             * 권장상황 => 배열이 절대 비어있지 않음이 보장될 때
             *
             * 2. 언제 값이 없을까?
             * arr.length == 0 인 경우
             *
             * "orElse(0)"
             * 1. 동작 방식
             * 평균이 존재하면 그 값 반환
             * 평균이 없으면 기본값 0 반환 (빈 배열일 경우, 예외 발생 X)
             * 예외 발생하지 않음! (안정성 높음)
             * 권장상황 => "일반적인 안전한 코드"
             *
             * 결론) 두 문제 모두 아래로 제출해도 가능 (배열 길이 ≥ 1 이므로 getAsDouble() 예외 발생 X)
             * return Arrays.stream(arr).average().getAsDouble();
             */
        }
    }

    public static void main(String[] args) {
        Day04_1.Solution sol = new Day04_1.Solution();
        // TEST
        double result = sol.solution(new int[]{1,2,3,4});
        System.out.println("result = " + result);
    }
}
