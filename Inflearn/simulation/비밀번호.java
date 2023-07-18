package Inflearn.simulation;

import java.util.*;
class 비밀번호 {
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
    final static int DIRECTION_SIZE = 8;

    public int solution(int[] keypad, String password){
        int answer = 0;
        char[] numbers = password.toCharArray();
        int[][] realKeypad = new int[3][3];
        int count = 0;
        for (int i = 0 ; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                realKeypad[i][j] = keypad[count];
                count++;
            }
        }
        int beforeKey = numbers[0] - 48;
        for (int nowKey : numbers) {
            nowKey -= 48;
            if (nowKey == beforeKey) {
                answer += 0;
            } else {
                int x = 0;
                int y = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (realKeypad[i][j] == beforeKey) {
                            x = i;
                            y = j;
                        }
                    }
                }

                boolean near = false;
                for (int i = 0; i < DIRECTION_SIZE; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (nx >= 0 && ny >= 0 && nx < 3 && ny < 3 && realKeypad[nx][ny] == nowKey) {
                        near = true;
                        break;
                    }
                }
                if (near) {
                    answer += 1;
                }else {
                    answer += 2;
                }
            }
            beforeKey = nowKey;
        }
        return answer;
    }

    public static void main(String[] args){
        비밀번호 T = new 비밀번호();
        System.out.println(T.solution(new int[]{2, 5, 3, 7, 1, 6, 4, 9, 8}, "7596218"));
        System.out.println(T.solution(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
        System.out.println(T.solution(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
        System.out.println(T.solution(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
    }
}