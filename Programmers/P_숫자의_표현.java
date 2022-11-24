package Programmers;

public class P_숫자의_표현 {
    class Solution {
        public int solution(int n) {
            int answer = 1;
            int start = 1;
            int end = 1;
            int sum = 1;

            while(end!=n) {
                if(sum>n) {
                    sum-=start;
                    start++;
                }else if (sum==n) {
                    answer++;
                    end++;
                    sum+=end;
                }else {
                    end++;
                    sum+=end;
                }
            }
            return answer;
        }
    }
}
