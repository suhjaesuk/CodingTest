package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class P1874_스택으로오름차순수열만들기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();

        StringBuffer stringBuffer = new StringBuffer();
        int num = 1;
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            int now = arr[i];
            if (now >= num) {
                while (now >= num) {
                    stack.push(num++);
                    stringBuffer.append("+\n");
                }

                stack.pop();
                stringBuffer.append("-\n");
            } else {
                int q = stack.pop();
                if (q > now) {
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else {
                    stringBuffer.append("-\n");
                }
            }
        }
        if (result) {
            System.out.println(stringBuffer.toString());
        }
    }
}
