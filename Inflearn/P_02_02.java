package Inflearn;

import java.util.Scanner;

public class P_02_02 {
    public int solution(int n, int[] arr){
        int answer =1;
        //해당 학생이 이때까지의 앞의 학생보다 커야한다.
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]){
                answer++;
            }else{
                arr[i]=arr[i-1];
            }
        }

        //answer++;
        return answer;
    }





    public static void main(String[] args) {
    P_02_02 P = new P_02_02();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
        System.out.println(P.solution(n,arr));
    }
}
