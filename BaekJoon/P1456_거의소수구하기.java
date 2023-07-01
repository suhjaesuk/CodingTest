package BaekJoon;

import java.util.Scanner;

public class P1456_거의소수구하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int[] numbers = new int[B+1];

        if (A == 1) {
            A++;
        }

        for (int i = 2; i <= B; i++) {
            numbers[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(B); i++) {
            if (numbers[i] == 0) {
                continue;
            }
            for (int j = i + i; j <= B; j = j + i) {
                numbers[j] = 0;
            }
        }

        int count = 0;
        for (int i = A; i <= Math.sqrt(B); i++) {
            int now = numbers[i];
            if (now != 0) {
                for (int j = now * now; j <= B; j = j * now) {
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
