package Inflearn;

import java.util.Scanner;

public class P_02_07 {

    public int solution(int n, int[] arr){
        int answer = 0;
        int plusPoint = 0;

        for(int i=1; i<n+1; i++){
            if(arr[i-1]==1) plusPoint++;
            if(arr[i-1]==0) plusPoint=0;
            answer+=plusPoint;
        }
        return answer;
    }
    public static void main(String[] args) {
        P_02_07 P = new P_02_07();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(P.solution(n, arr));
    }
}
