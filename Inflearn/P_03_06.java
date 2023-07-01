package Inflearn;

import java.util.Scanner;

public class P_03_06 {

    public int solution(int k, int[] numbers) {
        int answer = 0;
        int count = 0;
        int left = 0;
        for (int right = 0; right < numbers.length; right++) {
            if (numbers[right] == 0) {
                count++;
            }
            while (count > k) {
                if (numbers[left] == 0) {
                    count--;
                }
                left++;
            }
            if (answer < right - left + 1) {
                answer = right - left + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P_03_06 P = new P_03_06();
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = scanner.nextInt();
        int k = scanner.nextInt();
        int[] numbers = new int[totalNumbers];
        for (int i = 0; i < totalNumbers; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(P.solution(k, numbers));
    }
}
