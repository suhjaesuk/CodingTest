package Inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P_02_08 {

    public int[] solution(int studentCount, int[] scores) {
        int[] answer = new int[studentCount];
        for (int i = 0; i < studentCount; i++) {
            int count = 1;
            for (int j = 0; j < studentCount; j++) {
                if (scores[i] < scores[j]) {
                    count++;
                }
                answer[i] = count;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        P_02_08 P = new P_02_08();
        Scanner scanner = new Scanner(System.in);
        int studentCount = scanner.nextInt();
        int[] scores = new int[studentCount];
        for (int i = 0; i < studentCount; i++) {
            scores[i] = scanner.nextInt();
        }

        int[] answers = P.solution(studentCount, scores);
        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }
}
