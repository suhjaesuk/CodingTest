package Inflearn;

import java.util.Scanner;

public class P_03_04 {

    public int solution(int targetNumber, int[] numbers) {
        int left = 0;
        int right = 0;
        int sum = numbers[right];
        int answer = 0;
        while (right != numbers.length - 1) {
            if (sum < targetNumber) {
                right++;
                sum += numbers[right];
            }else if (sum > targetNumber) {
                sum -= numbers[left];
                left++;
            }else if (sum == targetNumber) {
                answer++;
                right++;
                sum += numbers[right];
            }
        }

        while (left != numbers.length - 1) {
            sum -= numbers[left];
            left++;
            if (sum == targetNumber) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P_03_04 P =  new P_03_04();
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = scanner.nextInt();
        int targetNumber = scanner.nextInt();
        int[] numbers = new int[totalNumbers];
        for (int i = 0 ; i < totalNumbers; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(P.solution(targetNumber, numbers));
    }
}
