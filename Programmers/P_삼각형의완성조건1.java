package Programmers;

import java.util.Arrays;

public class P_삼각형의완성조건1 {
    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);
        if(sides[0]+sides[1]>sides[2]){
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
