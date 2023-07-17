package Inflearn;

import java.util.Scanner;

public class P_10_03 {
    static int N;
    static int[] memo;
    public int solution(int[] arr) {
     int answer = 0;
     memo[0] = 1;
     for (int i = 1; i < N; i++) {
         int max = 0;
         for (int j = i - 1; j >= 0; j--) {
             if (arr[j] < arr[i] && memo[j] > max) {
                 max = memo[j];
             }
             memo[i] = max + 1;
             answer = Math.max(answer, memo[i]);
         }
     }
     for (int m : memo) {
         System.out.println(m);
     }
     return answer;
    }

    public static void main(String[] args) {
        P_10_03 problem = new P_10_03();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        memo = new int[N];
        System.out.println(problem.solution(arr));
    }
}
