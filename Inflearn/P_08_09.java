package Inflearn;

import java.util.Scanner;

public class P_08_09 {
    static int N, M;
    static int[] answer;

    public void dfs(int level, int start) {
        if (level == M) {
            for (int x : answer) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = start; i <= N; i++) {
                answer[level] = i;
                dfs(level + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        P_08_09 problem = new P_08_09();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        answer = new int[M];

        problem.dfs(0, 1);
    }
}
