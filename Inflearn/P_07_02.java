package Inflearn;

import java.util.Scanner;

public class P_07_02 {

    public void recursive(int N) {
        if (N==0) {
            return;
        }
        recursive(N / 2);
        System.out.print(N % 2);
    }

    public static void main(String[] args) {
        P_07_02 P = new P_07_02();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        P.recursive(N);
    }
}
