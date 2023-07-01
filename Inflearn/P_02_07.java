package Inflearn;

import java.util.Scanner;

public class P_02_07 {

    public int solution(int question, int[] scoring) {
        int count = 0;
        int answer = 0;
        for (int score : scoring) {
            if (score == 1) {
                count++;
            }else if (score == 0) {
                count = 0;
            }
            answer += count;
        }
        return answer;
    }


    public static void main(String[] args) {
        P_02_07 P = new P_02_07();
        Scanner scanner = new Scanner(System.in);
        int question = scanner.nextInt();
        int[] scoring = new int[question];
        for (int i = 0; i < question; i++) {
            scoring[i] = scanner.nextInt();
        }
        System.out.println(P.solution(question, scoring));
    }
}
