package Inflearn;

import java.util.Scanner;

public class P_01_06 {
    public String solution(String str) {
        String answer = "";
        char[] c = str.toCharArray();
        for(int i=0; i<str.length(); i++) {
            if (str.indexOf(c[i])==i) {
                answer += c[i];
            }
        }
        return answer;
    }
    public static void main (String[]args){
        P_01_06 T = new P_01_06();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}

