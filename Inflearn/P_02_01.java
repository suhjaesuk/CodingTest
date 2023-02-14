package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class P_02_01 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=0; i<n-1; i++){
            if(arr[i] < arr[i+1]){
                answer.add(arr[i+1]);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        P_02_01 P = new P_02_01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int x : P.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
