package Programmers;

public class P_키패드_누르기 {
    class Solution {
        public String solution(int[] numbers, String hand) {
            String answer ="";
            int left = 10;
            int right = 12;

            for (int i = 0; i < numbers.length; i++) {
                int n = numbers[i];

                if (n == 1 || n == 4 || n == 7) {
                    left = n;
                    answer+="L";
                }
                if (n == 3 || n == 6 || n == 9) {
                    right = n;
                    answer+="R";
                }
                if( n == 0 ) n = 11;
                int left_pos = (Math.abs(n - left) / 3) + (Math.abs(n - left) % 3);
                int right_pos =(Math.abs(n - right) / 3) + (Math.abs(n - right) % 3);
                if (n == 2 || n == 5 || n == 8 || n == 11) {
                    if (left_pos == right_pos){
                        if (hand.equals("right")) {
                            right = n;
                            answer+="R";
                        }else{
                            left = n;
                            answer+="L";
                        }
                    } else if (left_pos> right_pos) {
                        right = n;
                        answer+="R";
                    } else {
                        left = n;
                        answer+="L";
                    }
                }
            }
            return answer;
        }
    }
}
