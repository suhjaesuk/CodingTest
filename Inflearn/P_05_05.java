package Inflearn;

import java.util.Scanner;
import java.util.Stack;

public class P_05_05 {

    public int solution(String brackets) {
        int answer = 0;
        brackets = brackets + " ";
        Stack<Character> stack = new Stack<>();
        char[] bracketsArray = brackets.toCharArray();
        for (int i = 0; i < brackets.length() - 1; i++) {
            char nowBracket = bracketsArray[i];
            char nextBracket = bracketsArray[i + 1];
            if (nowBracket == '(') {
                if (nextBracket == ')') {
                    answer += stack.size();
                }else {
                    stack.push(nowBracket);
                    answer++;
                }
            }else if (nowBracket == ')') {
                if (nextBracket == ')') {
                    stack.pop();
                }
            }
        }
        return answer;
    }

    //해설 : 간단한 풀이
    public int solution1(String brackets) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                stack.push('(');
            }else {
                stack.pop();
                if (brackets.charAt(i - 1) == '(') {
                    answer += stack.size();
                }else {
                    answer++;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        P_05_05 P = new P_05_05();
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.nextLine();
        System.out.println(P.solution(brackets));

    }
}
