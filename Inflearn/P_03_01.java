package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class P_03_01 {

    public ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();

        int p1=0, p2=0;
        while(p1<n && p2<m){
            if(arr1[p1]< arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;
            }else {
                answer.add(arr2[p2]);
                p2++;
            }
        }
        while(p1<n){
            answer.add(arr1[p1]);
            p1++;
        }
        while(p2<m){
            answer.add(arr2[p2]);
            p2++;
        }
        return answer;
    }


    public static void main(String[] args) {
        P_03_01 P = new P_03_01();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++){
            arr2[i]=sc.nextInt();
        }

        for(Integer x :P.solution(n,arr1,m,arr2)){
            System.out.print(x+" ");
        }

    }
}
