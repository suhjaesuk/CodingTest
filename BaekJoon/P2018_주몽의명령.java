package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P2018_주몽의명령 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] sources = new int[N];
        for (int i = 0; i < N; i++) {
            sources[i] = scanner.nextInt();
        }
        Arrays.sort(sources);
        int answer = 0;
        int startIndex = 0;
        int endIndex = sources.length - 1;

        while (startIndex < endIndex) {
            if (sources[startIndex] + sources[endIndex] == M) {
                endIndex--;
                answer++;
            }
            else if (sources[startIndex] + sources[endIndex] < M) {
                startIndex++;
            }else {
                endIndex--;
            }
        }
        System.out.println(answer);
    }
}
