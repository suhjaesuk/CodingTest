package Inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P_06_06 {

    public ArrayList<Integer> solution(int totalStudent, int[] changedNumbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] originalNumbers = changedNumbers.clone();
        Arrays.sort(originalNumbers);

        for (int i = 0; i < totalStudent; i++) {
            if (originalNumbers[i] != changedNumbers[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P_06_06 P = new P_06_06();
        Scanner scanner = new Scanner(System.in);
        int totalStudent = scanner.nextInt();
        int[] changedNumbers = new int[totalStudent];
        for (int i = 0; i < totalStudent; i++) {
            changedNumbers[i] = scanner.nextInt();
        }
        ArrayList<Integer> answer = P.solution(totalStudent, changedNumbers);
        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}
