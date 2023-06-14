package BaekJoon;

import java.util.Scanner;

public class P11047_동전개수의최솟값구하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int target = scanner.nextInt();
        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = scanner.nextInt();
        }

        int count = 0;
        int index = N - 1;
        while (target > 0) {
            if (coins[index] <= target) {
                target -= coins[index];
                count++;
            }else {
                index--;
            }
        }
        System.out.println(count);
    }
}
