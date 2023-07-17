package Inflearn.simulation;

import java.util.*;
class 좌석_번호 {
    public int[] solution(int c, int r, int k){
        int[] answer = new int[2];
        boolean[][] seats = new boolean[c + 1][r + 1];
        int count = 1;
        final int UP = 0;
        int x = 1;
        int y = 1;
        int[] dx = {0, 1, 0, -1};
        int[] dy ={1, 0, -1, 0};
        seats[x][y] = true;
        int direction = UP;

        while (count != k) {
            if (c * r < k) {
                x = 0;
                y = 0;
                break;
            }

            int nx = x + dx[direction];
            int ny = y + dy[direction];
            if (nx >= 1 && ny >= 1 && nx <= c && ny <= r && !seats[nx][ny]) {
                count++;
                x = nx;
                y = ny;
                seats[x][y] = true;

            } else {
                direction = turn(direction);
            }
        }

        answer[0] = x;
        answer[1] = y;
        return answer;
    }

    public static int turn(int direction) {
        return (direction + 1) % 4;
    }

    public static void main(String[] args){
        좌석_번호 T = new 좌석_번호();
        System.out.println(Arrays.toString(T.solution(6, 5, 12)));
        System.out.println(Arrays.toString(T.solution(6, 5, 20)));
        System.out.println(Arrays.toString(T.solution(6, 5, 30)));
        System.out.println(Arrays.toString(T.solution(6, 5, 31)));
    }
}