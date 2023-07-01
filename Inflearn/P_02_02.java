package Inflearn;

import java.util.Scanner;

public class P_02_02 {

    public int solution(int total, int[] students) {
        int max = 0;
        int answer = 0;
        for (int student : students) {
            if (max < student) {
                max = student;
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        P_02_02 P = new P_02_02();
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int[] students = new int[total];
        for (int i = 0; i < total; i++) {
            students[i] = scanner.nextInt();
        }
        System.out.println(P.solution(total, students));
    }
}
