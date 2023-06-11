package BaekJoon;

import java.util.Scanner;

public class P1427_내림차순으로자릿수정렬하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        String[] numberArr = number.split("");
        int[] numbers = new int[numberArr.length];
        for (int i = 0; i < numberArr.length; i++) {
            numbers[i] = Integer.parseInt(numberArr[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            int swap = numbers[i];
            int index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (min > numbers[j]) {
                    swap = min;
                    min = numbers[j];
                    index = j;
                }
            }
            numbers[index] = swap;
            numbers[i] = min;
        }

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
