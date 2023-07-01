package Inflearn;

import java.util.Scanner;

public class P_02_09 {

    public int solution(int size, int[][] grid) {
        int maxSum = 0;
        //가로 합 구하기
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = 0; j < size; j++) {
                sum += grid[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        //세로 합 구하기
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = 0; j < size; j++) {
                sum += grid[j][i];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        //대각선 합 구하기
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += grid[i][i];
        }
        if (sum > maxSum) {
            maxSum = sum;
        }

        //대각선 합 구하기
        sum = 0;
        for (int i = size - 1; i <= 0; i--) {
            sum += grid[i][i];
        }
        if (sum > maxSum) {
            maxSum = sum;
        }

        return maxSum;
    }


    public static void main(String[] args) {
        P_02_09 P = new P_02_09();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] grid = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] =scanner.nextInt();
            }
        }
        System.out.println(P.solution(size, grid));
    }
}
