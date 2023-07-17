package Inflearn;

import java.util.Scanner;

public class P_10_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] memo = new int[M + 1];
        for (int i = 0; i < N; i++) {
            int score = scanner.nextInt();
            int time = scanner.nextInt();
            for (int j = M; j >= time; j--) {
                memo[j] = Math.max(memo[j], memo[j - time] + score);
            }
        }
        System.out.println(memo[M]);
    }
}
