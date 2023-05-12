package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P2018_주몽의명령 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sources = new int[n];
        for (int i = 0; i < n; i++) {
            sources[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sources);

        int answer = 0;
        int start = 0;
        int end = sources.length - 1;

        while (start <= end) {
            if (sources[start] + sources[end] == m) {
                answer++;
                start++;
                end--;
            }
            else if (sources[start] + sources[end] > m) {
                end--;
            }
            else {
                start++;
            }
        }

        System.out.println(answer);
    }
}
