package BaekJoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1931_회의실배정 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] times = new int[N][2];
        for (int i = 0; i < N; i++) {
            times[i][0] = scanner.nextInt();
            times[i][1] = scanner.nextInt();
        }

        Arrays.sort(times, new Comparator<int[]>() {
            @Override
            public int compare(int[] e1, int[] e2) {
                if (e1[1] == e2[1]) {
                    return e1[0] - e2[0];
                }
                return e1[1] - e2[1];
            }
        });

        int count = 0;
        int end = -1;
        for (int i = 0; i < N; i++) {
            if (times[i][0] >= end) {
                end = times[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
