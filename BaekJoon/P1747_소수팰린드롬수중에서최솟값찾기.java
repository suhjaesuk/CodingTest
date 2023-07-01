package BaekJoon;

import java.util.Scanner;

public class P1747_소수팰린드롬수중에서최솟값찾기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int limit = 1000000;
        int[] numbers = new int[limit + 1];
        for (int i = 2; i <= limit; i++) {
            numbers[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(limit); i++) {
            if (numbers[i] == 0) {
                continue;
            }
            for (int j = i + i; j <= limit; j = j + i) {
                numbers[j] = 0;
            }
        }

        for (int i = N; i <= limit; i++) {
            int now = numbers[i];
            if (now != 0) {
                if (isPalindrome(now)) {
                    System.out.println(now);
                    break;
                }
            }
        }
    }

    static boolean isPalindrome(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(number);
        String str =  stringBuilder.toString();
        String reverseStr = stringBuilder.reverse().toString();

        if (str.equals(reverseStr)) {
            return true;
        }
        return false;
    }
}
