package Inflearn;

import java.util.Scanner;

public class P_01_11 {
    public String solution(String str) {
        str=str+" ";
        String answer = "";
        char[] c = str.toCharArray();
        int count=1;

        for(int i=0; i<str.length()-1; i++) {
            if (c[i] == c[i + 1]) {
                count++;
            } else {
                answer += c[i];
                if (count>1){
                    answer += String.valueOf(count);
                    count = 1;
                }
            }
        }
        return answer;
    }

    public static void main (String[]args){
        P_01_11 T = new P_01_11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}

