package Inflearn;

import java.util.Scanner;

public class P_01_08 {
    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase();
        str = str.replaceAll("[^A-Z]",""); //대문자를 제외하고 모두 공백으로 변환
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) {
            answer="YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        P_01_08 T = new P_01_08();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
