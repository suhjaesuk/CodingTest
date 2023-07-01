package BaekJoon;

import java.util.Scanner;

public class P1850_쵀대공약수 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long result = gcd(a, b);
        while (result > 0) {
            stringBuilder.append("1");
            result--;
        }
        String answer= stringBuilder.toString();
        System.out.println(answer);

    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }else {
            return gcd(b, a % b);
        }
    }
}
