package Inflearn;

import java.util.Scanner;

public class P_01_02 {

    public String solution(String string) {
        char[] charArr = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : charArr) {
            if (Character.isUpperCase(c)) {
                stringBuilder.append(Character.toLowerCase(c));
            }else {
                stringBuilder.append(Character.toUpperCase(c));
            }
        }
        String answer = stringBuilder.toString();
        return answer;
    }
    public static void main(String[] args) {
        P_01_02 P = new P_01_02();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(P.solution(string));
    }
}
