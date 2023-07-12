package Inflearn;

import java.util.Scanner;

public class P_07_03 {

    public int recursive(int N) {
        if (N==1) {
            return 1;
        }

        return N * recursive(N - 1);

    }

    public static void main(String[] args) {
        P_07_03 P = new P_07_03();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(P.recursive(N));
    }
}
