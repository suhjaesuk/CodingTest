package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class P_01_04 {

    public String[] solution(int question, String[] words) {
        String[] answer = new String[question];
        for (int i = 0; i < question; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            answer[i] = stringBuilder.append(words[i]).reverse().toString();
        }
        return answer;
    }

    public static void main(String[] args) {
        P_01_04 P = new P_01_04();
        Scanner scanner = new Scanner(System.in);
        int question = scanner.nextInt();
        String[] words = new String[question];
        for (int i = 0; i < question; i++) {
            words[i] = scanner.next();
        }
        String[] answers = P.solution(question, words);
        for (String answer : answers) {
            System.out.println(answer);
        }
    }
}


