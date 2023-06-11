package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2751_수정렬하기2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
