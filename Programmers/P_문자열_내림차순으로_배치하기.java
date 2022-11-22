package Programmers;

import java.util.Arrays;

public class P_문자열_내림차순으로_배치하기 {
        public String solution(String s) {
            String[] arr = s.split("");
            StringBuilder sb = new StringBuilder();
            Arrays.sort(arr);

            for(int i = arr.length - 1 ; i >= 0; i--){
                sb.append(arr[i]);
            }
            String answer = sb.toString();
            return answer;
        }
    }

