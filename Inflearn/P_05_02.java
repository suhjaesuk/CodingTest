package Inflearn;

import java.util.Scanner;
import java.util.Stack;

public class P_05_02 {
    public String solution(String string) {
        char[] chars = string.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            if (c == ')') {
                while (stack.pop() != '(') {
                }
            }else {
                stack.push(c);
            }
        }
        for (char c : stack) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        P_05_02 P = new P_05_02();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(P.solution(string));
    }
}
