package BaekJoon;

import java.util.Scanner;

public class P1934_최소공배수 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int question = scanner.nextInt();
        for (int i = 0; i < question; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int answer = a * b / gcd(a,b);
            System.out.println(answer);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }else {
            return gcd(b, a % b);
        }
    }
}
