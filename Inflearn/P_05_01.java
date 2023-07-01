package Inflearn;

import java.util.Scanner;
import java.util.Stack;

public class P_05_01 {

    public String solution(String brackets) {
        char[] bracketArray = brackets.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char bracket : bracketArray) {
            if (bracket == '(') {
                stack.push(bracket);
            } else if (bracket == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                }else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        P_05_01 P = new P_05_01();
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.nextLine();
        System.out.println(P.solution(brackets));

    }
}
