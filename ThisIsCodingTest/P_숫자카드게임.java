package ThisIsCodingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P_숫자카드게임 {

    public int solution(int n, int m, int[][] arr){
        int answer = 0;
        List<Integer> lowestRowNumberList = new ArrayList<>();

        for(int i=0; i<n; i++){
            int lowestRowNumber = 10001;  //숫자는 1~10000이다. 2번째 반복문이 끝나면 초기화해야함.
            for(int j=0; j<m; j++){
                if(arr[i][j]<lowestRowNumber) lowestRowNumber = arr[i][j];
            }
            lowestRowNumberList.add(lowestRowNumber);
        }

        for(int x : lowestRowNumberList){
            if(answer<x) answer = x;
        }
        return answer;
    }
    public static void main(String[] args) {
        P_숫자카드게임 P = new P_숫자카드게임();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(P.solution(n,m,arr));
    }
}
