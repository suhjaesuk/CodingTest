package Inflearn;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class P_08_13 {
    static final int LAND = 1;
    static final int SEA = 0;
    static int N;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
    static int answer = 0;

    public void dfs(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >=0 && nx < N && ny < N && map[nx][ny] == 1 && !visit[nx][ny]) {
                visit[nx][ny] = true;
                dfs(nx, ny);
            }
        }
    }

    public void bfs(int x, int y) {
        Deque<Point> deque = new LinkedList<>();
        deque.add(new Point(x, y));
        while (!deque.isEmpty()) {
            Point point = deque.poll();
            for (int i = 0; i < 8; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if (nx >= 0 && ny >=0 && nx < N && ny < N && map[nx][ny] == LAND && !visit[nx][ny]) {
                    visit[nx][ny] = true;
                    deque.add(new Point(nx, ny));
                }
            }
        }
    }

    public void solution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == LAND && !visit[i][j]) {
                    answer++;
                    visit[i][j] = true;
                    bfs(i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        P_08_13 problem = new P_08_13();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = scanner.nextInt();
            }
        }
        visit = new boolean[N][N];
        problem.solution();
        System.out.println(answer);
    }
}
