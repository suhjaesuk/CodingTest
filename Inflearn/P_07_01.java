package Inflearn;

import java.util.Scanner;

public class P_07_01 {

    public void solution(int N) {
        if (N == 0) return;
        solution(N - 1);
        System.out.print(N + " ");

    }

    public static void main(String[] args) {
        P_07_01 P = new P_07_01();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        P.solution(N);
    }

}
