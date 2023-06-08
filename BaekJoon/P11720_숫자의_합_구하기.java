package BaekJoon;

import java.util.Scanner;

public class P11720_숫자의_합_구하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int numbers = scanner.nextInt();

        String numbersString = Integer.toString(numbers);
        char[] numberCharArray = numbersString.toCharArray();

        int sum = 0;
        for (int i = 0; i < numberCharArray.length; i++) {
            sum += numberCharArray[i] - '0';
        }

        System.out.println(sum);
    }
}
