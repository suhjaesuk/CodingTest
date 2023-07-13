package Inflearn;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P_08_05 {
    static int answer = Integer.MAX_VALUE;

    static int N;
    static Integer[] coins;

    static int target;

    public void dfs(int sum ,int level) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            if (answer > level) {
                answer = level;
            }
        } else {
            for (int i = 0; i < N; i++) {
                dfs(sum + coins[i], level + 1);
            }
        }
    }

    public static void main(String[] args) {
        P_08_05 problem = new P_08_05();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        coins = new Integer[N];
        for (int i = 0; i < N; i++) {
            coins[i] = scanner.nextInt();
        }
        Arrays.sort(coins, Collections.reverseOrder());
        target = scanner.nextInt();
        problem.dfs(0, 0);
        System.out.println(answer);
    }
}
