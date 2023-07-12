package Inflearn;

import java.util.Scanner;

public class P_07_04 {

    public int recursive(int N) {
        if (N == 1 || N == 2) {
            return 1;
        }
        return recursive(N - 1) + recursive(N - 2);





    }

    public static void main(String[] args) {
        P_07_04 P = new P_07_04();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print(P.recursive(i) + " ");
        }
    }
}
