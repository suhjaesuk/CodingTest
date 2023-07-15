package Inflearn;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class P_08_11 {
    static int size = 7;
    static boolean[][] visit;
    static int[][] miro;
    static int[][] distance;
    static int answer = 0;
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};

    public void bfs(int x, int y) {
        Deque<Point> deque = new LinkedList<>();
        deque.offer(new Point(x, y));
        while (!deque.isEmpty()) {
            if (deque.size() == 1) {
                answer++;
            }
            Point currentPoint = deque.poll();
            int currentX = currentPoint.x;
            int currentY = currentPoint.y;
            for (int direction = 0; direction < 4; direction++) {
                int nx = currentPoint.x + dx[direction];
                int ny = currentPoint.y + dy[direction];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && miro[nx][ny] == 0 && !visit[nx][ny]) {
                    visit[nx][ny] = true;
                    deque.offer(new Point(nx, ny));
                    distance[nx][ny] = distance[currentX][currentY] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        P_08_11 problem = new P_08_11();
        Scanner scanner = new Scanner(System.in);
        miro = new int[size + 1][size + 1];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                miro[i][j] = scanner.nextInt();
            }
        }
        distance = new int[size + 1][size + 1];
        visit = new boolean[size + 1][size + 1];
        visit[1][1] = true;
        problem.bfs(1, 1);
        if (distance[size][size] == 0) {
            System.out.println(-1);
        }else {
            System.out.println(distance[size][size]);
        }
    }
}
