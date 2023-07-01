package Inflearn;

import java.util.Scanner;

public class P_06_02 {

    //버블 정렬
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
    public static void main(String[] args) {
        P_06_02 P = new P_06_02();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int[] answer = P.solution(numbers);
        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}
