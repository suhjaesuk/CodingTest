package Inflearn;

import java.util.Scanner;

public class P_01_07 {
    public String solution(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        String answer = "NO";
        word = word.toUpperCase();
        String reverseWord = stringBuilder.append(word).reverse().toString();
        if (word.equals(reverseWord)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        P_01_07 P = new P_01_07();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(P.solution(word));
    }
}
