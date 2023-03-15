package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class P_03_02 {

    public ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();



        return answer;
    }

    public static void main(String[] args) {
        P_03_02 P = new P_03_02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[5];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[5];
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }
        for(int x : P.solution(n,arr1,m,arr2)) {
            System.out.print(x);
        }
    }
}
