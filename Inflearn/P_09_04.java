package Inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P_09_04 {
    static int N;
    static int maxDeadline = 0;
    static int answer = 0;
    static ArrayList<Lecture> lectures;

    public int solution() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        int j = 0;
        for (int i = maxDeadline; i >= 1; i--) {
            for ( ; j < N; j++) {
                if (lectures.get(j).deadline < i) {
                    break;
                }
                priorityQueue.offer(lectures.get(j).cost);
            }
            if (!priorityQueue.isEmpty()) {
                answer += priorityQueue.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P_09_04 problem = new P_09_04();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        lectures = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int cost = scanner.nextInt();
            int deadline = scanner.nextInt();
            maxDeadline = Math.max(maxDeadline, deadline);
            lectures.add(new Lecture(cost, deadline));
        }
        Collections.sort(lectures);
        System.out.println(problem.solution());
    }
}
