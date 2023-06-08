package BaekJoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11660_구간합구하기2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int questionCount = scanner.nextInt();
        int[][] intervalSum = new int[arraySize+1][arraySize+1];
        for (int row = 1 ; row <= arraySize; row++) {
            for (int col = 1; col <= arraySize; col++) {
                intervalSum[col][row] = scanner.nextInt() + intervalSum[col-1][row] + intervalSum[col][row-1] - intervalSum[col-1][row-1];
            }
        }

        for (int question = 0; question < questionCount; question++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            System.out.println(intervalSum[x2][y2] - intervalSum[x1 -1][y2] - intervalSum[x2][y1 -1] + intervalSum[x1 -1][y1 - 1]);
        }
    }
}
