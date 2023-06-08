package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P10986_나머지합구하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] intervalSum = new int[N+1];
        for (int i = 1; i <= N; i++) {
            intervalSum[i] = scanner.nextInt() + intervalSum[i-1];
        }
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                if ((intervalSum[i] - intervalSum[j-1]) % M == 0) {
                    answer = answer + 1;
                }
            }
        }
        System.out.println(answer);
    }
}
