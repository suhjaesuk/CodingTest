package Inflearn;

import java.util.Scanner;

public class P_08_04 {
    static int N;

    static int M;

    static int[] arr;

    public void dfs(int level) {
        if (level == M) {
            for (int number : arr) {
                System.out.print(number + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= N; i++) {
                arr[level] = i;
                dfs(level + 1);
            }
        }
    }

    public static void main(String[] args) {
        P_08_04 problem = new P_08_04();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        arr = new int [M];
        problem.dfs(0);
    }

}
