package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class P17298_오큰수구하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] numArr = new int[n];
        int[] answerArr = new int[n];
        String[] strArr = bufferedReader.readLine().split("");

        for (int i = 0; i < n; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 0; i < n; i++) {
            while(!stack.empty() && numArr[stack.peek()] < numArr[i]) {
                answerArr[stack.pop()] = numArr[i];
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            answerArr[stack.pop()] = -1;
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bufferedWriter.write(answerArr[i] + " ");
        }
        bufferedWriter.write("\n");
        bufferedWriter.flush();
    }
}
