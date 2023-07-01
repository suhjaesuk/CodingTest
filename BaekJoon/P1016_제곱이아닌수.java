package BaekJoon;

import java.util.Scanner;

public class P1016_제곱이아닌수 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long min = scanner.nextInt();
        long max = scanner.nextInt();
        boolean[] check = new boolean[(int) (max - min + 1)];

        for (long i = 2; i * i <= max; i++) {
            long pow = i * i;
            long start_index = min / pow;
            if (min % pow != 0) {
                start_index++;
            }
            for (long j = start_index; pow * j <= max; j++) {
                check[(int) ((j * pow) - min)] = true;
            }
        }

        int count = 0;
        for (int i = 0; i <= max - min; i++) {
            if (!check[i]) {
                count++;
            }
        }

        System.out.println(count);

    }
}
