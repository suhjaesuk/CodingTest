package Inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P_09_03 {

    public int solution(ArrayList<Friend> friends) {
        int answer = 0;
        Collections.sort(friends);
        int count = 0;
        for (Friend friend : friends) {
            if (friend.state == 'v') {
                count++;
            } else {
                count--;
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }
    public static void main(String[] args) {
        P_09_03 problem = new P_09_03();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Friend> friends = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int visit = scanner.nextInt();
            int leave = scanner.nextInt();
            friends.add(new Friend(visit, 'v'));
            friends.add(new Friend(leave, 'l'));
        }
        System.out.println(problem.solution(friends));

    }
}
