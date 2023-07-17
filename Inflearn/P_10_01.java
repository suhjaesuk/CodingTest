package Inflearn;

import java.util.Scanner;

public class P_10_01 {
    static int[] memo;
    static int N;

    public static int dynamicPrograming() {
        memo[1] = 1;
        memo[2] = 2;

        for (int i = 3; i <= N; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[N];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        memo = new int[N + 1];
        memo[1] = 1;
        memo[2] = 2;
        System.out.println(dynamicPrograming());
    }
}
