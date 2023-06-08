package BaekJoon;

import java.util.Scanner;

public class P1546_평균구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exams = scanner.nextInt();
        int[] scores = new int[exams];
        for (int i = 0; i < exams; i++) {
            int nowScore = scanner.nextInt();
            scores[i] = nowScore;
        }

        int maxScore = 0;
        for (int score : scores) {
            maxScore = Math.max(maxScore, score);
        }

        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += manipulateScore(scores[i], maxScore);
        }

        double average = sum / exams;

        System.out.println(average);

    }

    public static double manipulateScore(int score, int maxScore) {
        return score / (double)maxScore * 100;
    }
}
