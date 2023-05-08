package BaekJoon;

import java.util.Scanner;

public class P2018_연속된자연수의합구하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int start = 1;
        int end = 1;
        int sum = 1;
        int count = 0;
        while (end <= n) {
            if (sum < n) {
                end++;
                sum += end;
            }else if (sum == n) {
                count++;
                sum -= start;
                start++;
            }else if (sum > n) {
                sum -= start;
                start++;
            }
        }

        System.out.println(count);
    }
}
