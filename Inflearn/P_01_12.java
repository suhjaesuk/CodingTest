package Inflearn;

import java.util.Scanner;

public class P_01_12 {

    public char[] solution(int question, String password) {
        String[] words = new String[question];
        for (int i = 0; i < question; i++) {
            words[i] = password.substring(7 * i, 7 * (i + 1));
        }

        String[] binaries = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == '#') {
                    stringBuilder.append(1);
                }else if (words[i].charAt(j) == '*'){
                    stringBuilder.append(0);
                }
            }
            binaries[i] = stringBuilder.toString();
        }

        int[] decimals = new int[words.length];
        for (int i = 0; i < binaries.length; i++) {
            decimals[i] = Integer.parseInt(binaries[i], 2);
        }

        char[] answer = new char[decimals.length];
        for (int i = 0; i < decimals.length; i++) {
            answer[i] = (char) decimals[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        P_01_12 P = new P_01_12();
        Scanner scanner = new Scanner(System.in);
        int question = scanner.nextInt();
        String password = scanner.next();
        char[] answer = P.solution(question, password);
        for (char x : answer) {
            System.out.print(x);
        }
    }
}
