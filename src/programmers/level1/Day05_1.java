package programmers.level1;

// 자릿수 더하기
public class Day05_1 {
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            // int -> String
            String toStr = Integer.toString(n);

            // String -> char[]
            char[] arr = toStr.toCharArray();


            for (int i = 0; i < arr.length; i++) {
                answer = answer + (arr[i] - '0');
            }

            return answer;

            // 다른 사람 풀이
//            int answer = 0;
//
//            char[] arr = Integer.toString(n).toCharArray();
//
//            for(int i = 0; i < arr.length; i++){
//                answer += arr[i] - 48;
//            }
            /**
             * '0'부터 '9'까지 아스키코드는 48부터 57이고
             * 아스키코드값인 48을빼게 되면 그 차이만큼 반환되게 되는데,
             * 그 차이가 숫자와 같아서 arr[i] - '0' 또는 arr[i] - 48로 형변환
             */
//
//            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // TEST
        int result = sol.solution(4);
        System.out.println("result = " + result);
    }
}
