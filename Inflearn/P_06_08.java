package Inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P_06_08 {
    public int solution(int total, int target, int[] numbers) {
        Arrays.sort(numbers);
        int answer = 0;
        int start = 0;
        int end = total - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] > target) {
                end = mid - 1;
            }else if (numbers[mid] < target) {
                start = mid + 1;
            }else if (numbers[mid] == target) {
                answer = mid + 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P_06_08 P = new P_06_08();
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int target = scanner.nextInt();
        int[] numbers = new int[total];
        for (int i = 0; i < total; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(P.solution(total, target, numbers));
    }
}
