package Inflearn;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class Warehouse {
    int x;
    int y;

    public Warehouse(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class P_08_12 {
    static int N;
    static int M;
    static int[][] boxes;
    static int[] dx = {0, 1, 0 ,-1};
    static int[] dy = {1, 0, -1, 0};
    static final int ripeTomato = 1;
    static final int unripeTomato = 0;
    static int[][] distance;
    static Deque<Warehouse> deque = new LinkedList<>();

    public void dfs() {
        while (!deque.isEmpty()) {
            Warehouse currentBox = deque.poll();
            int currentX = currentBox.x;
            int currentY = currentBox.y;
            for (int i = 0; i < 4; i++) {
                int nx = currentX + dx[i];
                int ny = currentY + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < M && boxes[nx][ny] == unripeTomato) {
                    boxes[nx][ny] = ripeTomato;
                    deque.offer(new Warehouse(nx, ny));
                    distance[nx][ny] = distance[currentX][currentY] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        P_08_12 problem = new P_08_12();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        boxes = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int currentBox = scanner.nextInt();
                if (currentBox == ripeTomato) {
                    deque.offer(new Warehouse(i, j));
                }
                boxes[i][j] = currentBox;
            }
        }
        distance = new int[N][M];
        problem.dfs();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (boxes[i][j] == unripeTomato) {
                    flag = false;
                }
            }
        }

        if (flag) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (answer < distance[i][j]) {
                        answer = distance[i][j];
                    }
                }
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}
