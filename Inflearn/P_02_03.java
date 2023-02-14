package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class P_02_03 {
    public ArrayList<String> solution(int n, int[] arr1, int[] arr2){
        ArrayList<String> answer = new ArrayList<>();

        for(int i=0; i<n; i++){
                if (arr1[i] == arr2[i]) answer.add("D");
                else if(arr1[i]-arr2[i]== -2 || arr1[i] -arr2[i] ==  1 ) {
                    answer.add("A");
                }else {
                    answer.add("B");
                }
        }

        return answer;
    }

    public static void main(String[] args) {
        P_02_03 P = new P_02_03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }

        for(String str : P.solution(n, arr1, arr2)){
            System.out.println(str);
        }
    }
}
