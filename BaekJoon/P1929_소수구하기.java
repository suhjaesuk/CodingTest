package BaekJoon;

import java.util.Scanner;

public class P1929_소수구하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int[] numbers = new int[end+1];
        for (int i = 2; i <= end; i++) {
            numbers[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(end); i++) {
            if (numbers[i] == 0) {
                continue;
            }
            for (int j = i + i; j <= end; j = j + i) {
                numbers[j] = 0;
            }
        }
        for (int i = start; i <= end; i++) {
            if (numbers[i] != 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
