package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10986_나머지합구하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        int[] arraySum = new int[n+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= n; i++) {
            arraySum[i] = Integer.parseInt(stringTokenizer.nextToken()) + arraySum[i-1];
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if((arraySum[i] - arraySum[j-1]) % m == 0) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
