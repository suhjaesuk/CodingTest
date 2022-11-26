package Programmers;

import java.util.Arrays;

public class P_문자열_정렬하기2 {
    class Solution {
    public String solution(String my_string) {
        char[] myLowChar = my_string.toLowerCase().toCharArray();
        Arrays.sort(myLowChar);

        return new String(myLowChar);
    }
}
}
