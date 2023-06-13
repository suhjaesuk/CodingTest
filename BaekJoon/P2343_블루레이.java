package BaekJoon;

import java.util.Scanner;

public class P2343_블루레이 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] videos = new int[N];
        int start = 0;
        int end = 0;
        for (int i = 0; i < N; i++) {
            videos[i] = scanner.nextInt();
            if (start < videos[i]) {
                start = videos[i];
            }
            end = end + videos[i];
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0;
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (sum + videos[i] > mid) {
                    count++;
                    sum = 0;
                }
                sum = sum + videos[i];
            }
            if (sum != 0) {
                count++;
            }
            if (count > M) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        System.out.println(start);
    }
}
