package Inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class P_06_09 {

    public int count(int[] arr, int capacity) {
        int count = 1;
        int sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                count++;
                sum = x;
            }else {
                sum += x;
            }
        }
        return count;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int left = Arrays.stream(arr).max().getAsInt();
        int right = Arrays.stream(arr).sum();
        while (left <= right) {
            int mid = (left + right) / 2;
            if (count(arr, m) <= m) {
                answer = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P_06_09 P = new P_06_09();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(P.solution(n, m, arr));
    }
}
