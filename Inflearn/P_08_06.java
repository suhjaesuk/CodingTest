package Inflearn;

import java.util.Scanner;

public class P_08_06 {
    static int N, M;

    static int[] numbers;

    static int[] answer;

    static boolean[] check;

    public void dfs(int level) {
        if (level == M) {
            for (int x : answer) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < N; i++) {
                if (!check[i]) {
                    check[i] = true;
                    answer[level] = numbers[i];
                    dfs(level + 1);
                    check[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        P_08_06 problem = new P_08_06();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        answer = new int[M];
        check = new boolean[N];
        problem.dfs(0);
    }
}
