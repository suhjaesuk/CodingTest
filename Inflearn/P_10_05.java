package Inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class P_10_05 {
    static int N, M;
    static int[] memo;
    static int[] coins;


    public int solution() {
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = 0;
        for (int i = 0; i < N; i++) {
            for (int j = coins[i]; j <= M; j++) {
                memo[j] = Math.min(memo[j], memo[j - coins[i]] + 1);
            }
        }
        return memo[M];
    }

    public static void main(String[] args) {
        P_10_05 problem = new P_10_05();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = scanner.nextInt();
        }
        M = scanner.nextInt();
        memo = new int[M + 1];
        System.out.println(problem.solution());
    }
}
