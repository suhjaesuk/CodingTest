package BaekJoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660_구간합구하기2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int arraySize = Integer.parseInt(stringTokenizer.nextToken());
        int queryCount = Integer.parseInt(stringTokenizer.nextToken());

        int[][] array = new int[arraySize + 1][arraySize + 1];
        for (int i = 1; i <= arraySize; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 1; j <= arraySize; j ++) {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        int[][] arraySum = new int[arraySize + 1][arraySize + 1];
        for (int i = 1; i <= arraySize; i++) {
            for (int j = 1; j <= arraySize; j++) {
                arraySum[i][j] = arraySum[i][j - 1] + arraySum[i - 1][j] - arraySum[i - 1][j - 1] + array[i][j];
            }
        }

        for (int i = 0; i < queryCount; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int startX = Integer.parseInt(stringTokenizer.nextToken());
            int startY = Integer.parseInt(stringTokenizer.nextToken());
            int endX = Integer.parseInt(stringTokenizer.nextToken());
            int endY = Integer.parseInt(stringTokenizer.nextToken());

            int answer = arraySum[endX][endY] - arraySum[startX - 1][endY]
                    - arraySum[endX][startY - 1] + arraySum[startX - 1][startY - 1];
            System.out.println(answer);
        }

    }
}
