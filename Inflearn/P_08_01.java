package Inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class P_08_01 {
    static int N;
    static String answer = "NO";
    static boolean flag = false;
    static int[] numbers;
    static int sum;

    public void dfs(int sumOfSubset, int index) {
        if (flag || sumOfSubset > sum / 2) {
            return;
        }
        if (index == N) {
            if((sum - sumOfSubset == sumOfSubset)) {
                answer = "YES";
                flag = true;
            }
        } else {
            dfs(sumOfSubset + numbers[index],index + 1);
            dfs(sumOfSubset, index + 1);
        }
    }

    public static void main(String[] args) {
        P_08_01 problem = new P_08_01();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        numbers = new int[N + 1];
        sum = 0;
        for (int i = 0; i < N; i++) {
            int currentNumber = scanner.nextInt();
            sum += currentNumber;
            numbers[i] = currentNumber;
        }
        problem.dfs(0, 0);
        System.out.println(answer);
    }
}
