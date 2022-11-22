package Programmers;

public class P_수박수박수박수박수 {
    class Solution {
        public String solution(int n) {
            String answer = "";
            for(int i=1; i<=n; i++) {
                if(i%2 != 0) { //홀수일경우
                    answer += "수";
                }else answer += "박"; //짝수일경우
            }
            return answer;
        }
    }
}
