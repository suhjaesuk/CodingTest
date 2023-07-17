package Inflearn.simulation;

import java.util.*;
class 청소 {
    public int[] solution(int[][] room, int k){
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, -0, -1};
        final int OBSTACLE = 1;
        final int RIGHT = 1;
        int time = 0;
        int x = 0;
        int y = 0;

        int direction = RIGHT;
        while (time != k) {
            time++;
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            if (!isRoomArea(nx, ny, room) || room[nx][ny] == OBSTACLE) {
                direction = turn(direction);
                continue;
            }
            x = nx;
            y = ny;
        }

        int[] answer = new int[2];
        answer[0] = x;
        answer[1] = y;
        return answer;
    }

    public static boolean isRoomArea(int x, int y, int[][] room) {
        int size = room.length;
        if (x >= 0 && y >= 0 && x < size && y < size) {
            return true;
        }
        return false;
    }

    static int turn(int direction) {
        return (direction + 1) % 4;
    }

    public static void main(String[] args){
        청소 T = new 청소();
        int[][] arr1 = {{0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr1, 10)));
        int[][] arr2 = {{0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr2, 20)));
        int[][] arr3 = {{0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr3, 25)));
    }
}