package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1920_원하는정수찾기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        int T = scanner.nextInt();
        int[] targets = new int[T];
        for (int i = 0; i < T; i++) {
            targets[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        for (int target : targets) {
            int start = 0;
            int end = N-1;
            boolean result = false;

            while (start <= end) {
                int mid = (start + end) / 2;
                if (numbers[mid] > target) {
                    end = mid - 1;
                }else if (numbers[mid] < target) {
                    start = mid +1;
                }else {
                    result = true;
                    break;
                }
            }

            if (result) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }
    }
}
