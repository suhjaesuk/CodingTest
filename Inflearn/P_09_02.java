package Inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P_09_02 {
    static ArrayList<Meeting> meetings;
    static int N;
    static int answer = 0;

    public void solution() {
        int usableTime = 0;
        for (Meeting meeting : meetings) {
            if (meeting.startTime >= usableTime) {
                usableTime = meeting.endTime;
                answer++;
            }
        }
    }


    public static void main(String[] args) {
        P_09_02 problem = new P_09_02();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        meetings = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int startTime = scanner.nextInt();
            int endTime = scanner.nextInt();
            meetings.add(new Meeting(startTime, endTime));
        }
        Collections.sort(meetings);
        problem.solution();
        System.out.println(answer);
    }
}
