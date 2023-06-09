package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P1253_좋은수찾기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        int answer = 0;

        for (int i = 0; i < N; i++) {
            int target = numbers[i];
            int startIndex = 0;
            int endIndex = N-1;
            while (startIndex < endIndex) {
                if(numbers[startIndex] + numbers[endIndex] == target) {
                    if (startIndex != i && endIndex != i) {
                        answer++;
                        break;
                    } else if (startIndex == i) {
                        startIndex++;
                    } else if (endIndex == i) {
                        endIndex--;
                    }
                }else if (numbers[startIndex] + numbers[endIndex] < target) {
                    startIndex++;
                } else {
                    endIndex--;
                }
            }
        }
        System.out.println(answer);
    }
}
