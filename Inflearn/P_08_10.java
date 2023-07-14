package Inflearn;

import java.util.Scanner;

public class P_08_10 {
    static int answer = 0;
    static boolean[][] visit;
    static int[][] miro;
    static int size = 7;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    public void dfs(int x, int y) {
        if (x == size && y == size) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && miro[nx][ny] == 0 && !visit[nx][ny]) {
                    visit[nx][ny] = true;
                    dfs(nx, ny);
                    visit[nx][ny] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        P_08_10 problem = new P_08_10();
        Scanner scanner = new Scanner(System.in);
        miro = new int[size + 1][size + 1];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                miro[i][j] = scanner.nextInt();
            }
        }
        visit = new boolean[size + 1][size + 1];
        visit[1][1] = true;
        problem.dfs(1, 1);
        System.out.println(answer);
    }
}
