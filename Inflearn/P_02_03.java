package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class P_02_03 {
    public String[] solution(int total, int[] A, int[] B) {
        String[] answer = new String[total];
        for (int i = 0; i < total; i++) {
            if (A[i] - B[i] == 0) {
                answer[i] = "D";
            }else if (A[i] - B[i] == 1 || A[i] - B[i] == -2) {
                answer[i] = "A";
            }else {
                answer[i] = "B";
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        P_02_03 P = new P_02_03();
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int[] A = new int[total];
        int[] B = new int[total];
        for (int i = 0; i < total; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < total; i++) {
            B[i] = scanner.nextInt();
        }
        String[] answer = P.solution(total, A, B);
        for (String s : answer) {
            System.out.println(s);
        }
    }
}
