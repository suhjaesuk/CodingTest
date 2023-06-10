package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class P1874_스택으로오름차순수열만들기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        boolean result = true;
        int now = 1;
        for (int i = 0; i < N; i++) {
            while (numbers[i] >= now) {
                stack.push(now);
                now++;
                stringBuilder.append("+\n");
            }

            if (numbers[i] == stack.peek()) {
                stack.pop();
                stringBuilder.append("-\n");
            }

            if (!stack.isEmpty() && numbers[i] < stack.peek()) {
                System.out.println("NO");
                result = false;
                break;
            }
        }
        String answer = stringBuilder.toString();

        if (result) {
            System.out.println(answer);
        }
    }
}
