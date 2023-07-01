package Inflearn;

import java.util.Scanner;

public class P_01_06 {

    public String solution(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] alphabets = word.toCharArray();
        for (int i = 0; i < alphabets.length; i++) {
            if (word.indexOf(alphabets[i]) == i) {
                stringBuilder.append(alphabets[i]);
            }
        }
        String answer = stringBuilder.toString();
        return answer;
    }

    public static void main(String[] args) {
        P_01_06 P = new P_01_06();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(P.solution(word));
    }
}

