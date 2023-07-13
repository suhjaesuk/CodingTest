package Inflearn;

import java.util.Scanner;

public class P_08_03 {
    static int totalQuiz;
    static int limitTime;
    static int answer = 0;
    static int[][] quizzes;
    static final int scoreIndex = 0;
    static final int timeIndex = 1;

    public void dfs(int sumOfScore, int sumOfTime, int currentQuiz) {
        if (sumOfTime > limitTime) {
            return;
        }
        if (currentQuiz == totalQuiz) {
            if (sumOfScore > answer) {
                answer = sumOfScore;
            }
        } else {
            dfs(sumOfScore + quizzes[currentQuiz][scoreIndex], sumOfTime + quizzes[currentQuiz][timeIndex], currentQuiz + 1);
            dfs(sumOfScore, sumOfTime, currentQuiz + 1);
        }
    }

    public static void main(String[] args) {
        P_08_03 problem = new P_08_03();
        Scanner scanner = new Scanner(System.in);
        totalQuiz = scanner.nextInt();
        limitTime = scanner.nextInt();
        quizzes = new int[totalQuiz][2];
        for (int currentQuiz = 0; currentQuiz < totalQuiz; currentQuiz++) {
            int score = scanner.nextInt();
            int time = scanner.nextInt();
            quizzes[currentQuiz][scoreIndex] = score;
            quizzes[currentQuiz][timeIndex] = time;
        }
        problem.dfs(0, 0, 0);
        System.out.println(answer);
    }
}
