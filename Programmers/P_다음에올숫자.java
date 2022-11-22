package Programmers;

public class P_다음에올숫자 {
    public int solution(int[] common) {
        int answer = 0;
        int a = common[0];
        int b = common[1];
        int c = common[2];
        int n = common.length;

        if((b-a)==(c-b)) {
            answer = common[n-1] + (b-a);
        } else {
            answer = common[n-1] * (b/a);
        }
        return answer;
    }
}

