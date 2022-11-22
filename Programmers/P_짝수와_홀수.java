package Programmers;

import java.util.Scanner;

public class P_짝수와_홀수 {
    public String solution(int num) {
        if (num % 2 ==0) {
            return ("Even");
        }else {
            return("Odd");
        }
    }

    public static void main(String[] args) {
        P_짝수와_홀수 T = new P_짝수와_홀수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
