package Inflearn;

import java.util.Scanner;

public class P_08_08 {
    static int[] combinations, numbers;
    static boolean[] check;
    static int N, target;
    static boolean flag = false;
    int[][] memo = new int[35][35];

    //조합 구하기
    public int combination(int N, int r) {
        if (memo[N][r] > 0) {
            return memo[N][r];
        }
        if (N == r || r == 0) {
            return 1;
        } else {
            return memo[N][r] = combination(N - 1, r - 1) + combination(N - 1, r);
        }
    }

    public void dfs(int level, int sum) {
        if (flag) {
            return;
        }
        if (level == N) {
            if (sum == target) {
                for (int x : numbers) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for (int i = 1; i <= N; i++) {
                if (!check[i]) {
                    check[i] = true;
                    numbers[level] = i;
                    dfs(level + 1, sum + (combinations[level] * numbers[level]));
                    check[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        P_08_08 problem = new P_08_08();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        target = scanner.nextInt();
        combinations = new int[N];
        numbers = new int[N];
        check = new boolean[N + 1];
        for (int i = 0; i < N; i++) {
            combinations[i] = problem.combination(N - 1, i);
        }
        problem.dfs(0, 0);
    }
}
