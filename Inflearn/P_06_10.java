package Inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class P_06_10 {

    public int count(int[] arr, int distance) {
        int count = 1;
        int end = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - end >= distance) {
                count++;
                end = arr[i];
            }
        }
        return count;
    }

    public int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int left = 1;
        int right = arr[n - 1];
        while (left <= right) {
            int mid = (left + right) / 2;
            if (count(arr, mid) >= c) {
                answer = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P_06_10 P = new P_06_10();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(P.solution(n, c, arr));
    }
}
