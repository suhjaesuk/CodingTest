package Inflearn;

import java.util.Scanner;

public class P_02_09 {

    public int solution(int n, int[][] arr){
        int answer = 0;
        int rowSum, columnSum, diagonalSum1, diagonalSum2 ;

        for(int i=0; i<n; i++){
            rowSum = columnSum =0;
            for(int j=0; j<n; j++){
                rowSum+=arr[i][j];
                columnSum+=arr[j][i];
            }
            answer = Math.max(answer, rowSum);
            answer = Math.max(answer, columnSum);
        }

        diagonalSum1=diagonalSum2=0;

        for(int i=0; i<n; i++) {
        diagonalSum1+=arr[i][i];
        diagonalSum2+=arr[i][n-i-1];
        }
        answer = Math.max(answer, diagonalSum1);
        answer = Math.max(answer, diagonalSum2);

        return answer;
    }

    public static void main(String[] args) {
        P_02_09 P = new P_02_09();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(P.solution(n,arr));
    }
}
