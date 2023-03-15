package ThisIsCodingTest;

import java.util.Scanner;

public class P_게임개발 {
    static int n, m, x, y, dir;
    static int[][] map;
    static int[] dx = {-1, 0, 1, 0}; // 북, 동, 남, 서
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        dir = sc.nextInt();

        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int count = 1;
        int turnTime = 0;

        while (true) {
            // 현재 위치를 방문 처리
            map[x][y] = 2;

            // 왼쪽으로 회전
            dir = (dir + 3) % 4;

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 회전한 이후 정면에 가보지 않은 칸이 존재하는 경우 이동
            if (map[nx][ny] == 0) {
                x = nx;
                y = ny;
                count++;
                turnTime = 0;
                continue;
            }
            // 회전한 이후 정면에 가보지 않은 칸이 없거나 바다인 경우
            else {
                turnTime++;
            }

            // 네 방향 모두 갈 수 없는 경우
            if (turnTime == 4) {
                nx = x - dx[dir];
                ny = y - dy[dir];

                // 뒤로 갈 수 있다면 이동하기
                if (map[nx][ny] == 1) {
                    break;
                }
                // 뒤가 바다로 막혀있는 경우
                else {
                    x = nx;
                    y = ny;
                    turnTime = 0;
                }
            }
        }

        System.out.println(count);
    }
}