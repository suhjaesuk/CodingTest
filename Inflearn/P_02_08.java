package Inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P_02_08 {

    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];

        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=0; j<n; j++){
                if(arr[j]>arr[i]) count++;
            }
            answer[i] = count;
        }
        return answer;
    }

    public static void main(String[] args) {
        P_02_08 P = new P_02_08();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int x: P.solution(n, arr)){
            System.out.println(x+" ");
        }
    }
}
