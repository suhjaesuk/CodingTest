package BaekJoon;

import java.util.Scanner;

public class P2018_연속된자연수의합구하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int answer = 1;
        int sum = 1;
        int startIndex = 1;
        int endIndex = 1;

        while (endIndex != N) {
            if (sum == N) {
                answer++;
                endIndex++;
                sum += endIndex;
            }else if (sum > N) {
                sum -= startIndex;
                startIndex++;
            }else {
                endIndex++;
                sum += endIndex;
            }
        }
        System.out.println(answer);
    }
}
