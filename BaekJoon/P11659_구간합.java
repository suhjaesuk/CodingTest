package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11659_구간합 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int arrayCount = Integer.parseInt(stringTokenizer.nextToken());
        int queryCount = Integer.parseInt(stringTokenizer.nextToken());

        int[] arraySum = new int[arrayCount + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= arrayCount; i++) {
            arraySum[i] = arraySum[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < queryCount; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            int answer = arraySum[end] - arraySum[start-1];
            System.out.println(answer);
        }
    }
}
