package Inflearn;

import java.util.Scanner;

public class P_01_09 {
    public int solution(String str) {
        int answer=0;
        str = str.replaceAll("[^0-9]", "");
        answer=Integer.parseInt(str);
        return answer;
    }

    public static void main (String[]args){
        P_01_09 T = new P_01_09();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}

