package programmers.level1;

// 각도기
public class Day03_2 {
    static class Solution {
        public int solution(int angle) {
            int answer = 0;

            if(angle > 0 && angle < 90){
                answer = 1;
            } else if (angle == 90){
                answer = 2;
            } else if(angle > 90 && angle < 180){
                answer = 3;
            } else if (angle == 180) {
                answer = 4;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // TEST
        int result = sol.solution(70);
        System.out.println("result = " + result);
    }
}
