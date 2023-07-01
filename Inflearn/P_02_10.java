package Inflearn;

import java.util.Scanner;

public class P_02_10 {

    int direction = 4;
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    public int solution(int size, int[][] grid) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean flag = true;
                for (int k = 0; k < direction; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (0 <= nx && nx < size && 0 <= ny && ny < size && grid[i][j] < grid[nx][ny]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        P_02_10 P = new P_02_10();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] grid = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        System.out.println(P.solution(size, grid));
    }
}
