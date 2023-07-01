package Inflearn;

import java.util.Scanner;
import java.util.Stack;

public class P_05_04 {

    public int solution(String postfix) {
        char[] chars = postfix.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (char c : chars) {
            if (Character.isDigit(c)) {
                stack.push((int) c - 48);
            } else {
                int result = 0;
                int pop1 = stack.pop();
                int pop2 = stack.pop();
                if (c == '+') {
                    result = pop2 + pop1;
                } else if (c == '-') {
                    result = pop2 - pop1;
                } else if (c == '*') {
                    result = pop2 * pop1;
                } else if (c == '/') {
                    result = pop2 / pop1;
                }
                stack.push(result);
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        P_05_04 P = new P_05_04();
        Scanner scanner = new Scanner(System.in);
        String postfix = scanner.nextLine();
        System.out.println(P.solution(postfix));
    }
}
