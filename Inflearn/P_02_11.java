package Inflearn;

import java.util.Scanner;

public class P_02_11 {

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max = -1;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (max < count) {
                max = count;
                answer = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        P_02_11 P = new P_02_11();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(P.solution(n,arr));
    }
}

