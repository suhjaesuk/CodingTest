package Inflearn;

import java.util.Scanner;

public class P_03_05 {

    public int solution(int targetNumber) {
        int left = 1;
        int right = 2;
        int sum = right + left;
        int answer = 0;
        while (right != targetNumber) {
            if (sum < targetNumber) {
                right++;
                sum += right;
            }else if (sum > targetNumber) {
                sum -= left;
                left++;
            }else if (sum == targetNumber) {
                answer++;
                right++;
                sum += right;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P_03_05 P =  new P_03_05();
        Scanner scanner = new Scanner(System.in);
        int targetNumber = scanner.nextInt();
        System.out.println(P.solution(targetNumber));
    }
}
