package Inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P_05_08 {

    public int solution(int N, int M, int[] risks) {
        int count = 0;
        Queue<Patient> waiting = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            Patient patient = new Patient(risks[i], i);
            waiting.offer(patient);
        }

        while(true) {
            count++;
            boolean goBack = false;
            Patient firstPatient = waiting.poll();
            if (firstPatient.index == M) {
                break;
            }
            for (Patient otherPatient : waiting) {
                if (firstPatient.risk < otherPatient.risk) {
                    goBack = true;
                }
            }
            if (goBack) {
                waiting.offer(firstPatient);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        P_05_08 P = new P_05_08();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] risks = new int[N];
        for (int i = 0; i < N; i++) {
            risks[i] = scanner.nextInt();
        }
        System.out.println(P.solution(N, M, risks));
    }

    public static class Patient {
        int risk;
        int index;

        public Patient(int risk, int index) {
            this.risk = risk;
            this.index = index;
        }
    }
}
