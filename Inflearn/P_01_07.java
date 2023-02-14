package Inflearn;

import java.util.Scanner;

public class P_01_07 {
    public String solution(String str) {
        String answer = "YES";
        str=str.toUpperCase();
        char[] c = str.toCharArray();
        int rt =str.length()-1;

        for(int i=0; i<str.length()/2; i++) {
            if(c[i]!=c[rt-i]) answer ="NO";
        }
        return answer;
    }
    public static void main (String[]args){
        P_01_07 T = new P_01_07();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
