package Inflearn;

import java.util.Scanner;

public class P_01_03 {
    public String solution (String str) {
        String answer = "";
        String[] strArr = str.split(" ");
        for (String s : strArr) {
            if (s.length() > answer.length()) {
                answer = s;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        P_01_03 T = new P_01_03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));

    }
}
