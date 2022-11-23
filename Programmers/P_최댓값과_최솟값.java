package Programmers;

import java.util.Arrays;

public class P_최댓값과_최솟값 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] strArr = s.split(" ");

            int[] intArr = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                intArr[i] = Integer.parseInt(strArr[i]);
            }
            Arrays.sort(intArr);

            int max = intArr[strArr.length - 1];
            int min = intArr[0];

            return min + " " + max;
        }
    }
}
