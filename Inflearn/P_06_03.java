package Inflearn;

import java.util.Scanner;

public class P_06_03 {

    //삽입 정렬
    public int[] solution(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (numbers[j] > temp) {
                    numbers[j + 1] = numbers[j];
                }else {
                    break;
                }
            }
            numbers[j + 1] = temp;
        }
        return numbers;
    }
    public static void main(String[] args) {
        P_06_03 P = new P_06_03();
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
