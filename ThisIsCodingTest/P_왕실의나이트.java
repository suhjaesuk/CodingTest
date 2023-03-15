package ThisIsCodingTest;

import java.util.Scanner;

public class P_왕실의나이트 {

    public int solution(String location){
        int answer = 0;
        int row = location.charAt(1) - '0';
        int column = location.charAt(0) - 'a' + 1;

        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

        for (int i = 0; i < 8; i++) {
            int movedRow = row + dx[i];
            int movedColumn = column + dy[i];

            if (movedRow >= 1 && movedRow <= 8 && movedColumn >= 1 && movedColumn <= 8) {
                answer ++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        P_왕실의나이트 P = new P_왕실의나이트();
        Scanner sc = new Scanner(System.in);
        String location = sc.next();
        System.out.println(P.solution(location));
    }
}
