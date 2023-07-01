package Inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class P_06_01 {

    //선택 정렬
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    index = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = temp;
        }
        return numbers;
    }
    public static void main(String[] args) {
        P_06_01 P = new P_06_01();
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
