package Inflearn;

import java.util.Scanner;

public class P_08_02 {
    static boolean flag = false;
    static int limitWeight;
    static int answer = 0;
    static int N;
    static int[] weights;

    public void dfs(int sumOfWeight, int index) {
        if (sumOfWeight > limitWeight) {
            return;
        }
        if (index == N) {
            if (answer < sumOfWeight) {
                answer = sumOfWeight;
            }
        } else {
            dfs(sumOfWeight + weights[index], index + 1);
            dfs(sumOfWeight, index + 1);
        }
    }

    public static void main(String[] args) {
        P_08_02 problem = new P_08_02();
        Scanner scanner = new Scanner(System.in);
        limitWeight = scanner.nextInt();
        N = scanner.nextInt();
        weights = new int[N];
        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
        }
        problem.dfs(0, 0);
        System.out.println(answer);
    }
}
