package Inflearn;

import java.util.Scanner;

public class P_01_11 {
    public String solution(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        word = word + " ";
        int count = 1;

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
            }else {
                stringBuilder.append(word.charAt(i));
                if (count > 1) {
                    stringBuilder.append(count);
                    count = 1;
                }
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        P_01_11 P = new P_01_11();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(P.solution(word));
    }
}

