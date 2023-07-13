package Inflearn;

import java.util.Scanner;

public class P_08_07 {
    int[][] memo = new int[35][35];
    public int dfs (int n, int r) {
        if (n == r || r == 0) {
            return 1;
        } else {
            return memo[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
        }
    }

    public static void main(String[] args) {
        P_08_07 problem = new P_08_07();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(problem.dfs(n, r));
    }
}
