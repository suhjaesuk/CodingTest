package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11044_K번째수구하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] numbers = new int[N+1];
        for(int i = 1; i <= N; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);

        System.out.println(numbers[K]);
    }
}
