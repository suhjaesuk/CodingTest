package Inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P_09_01 {
    static ArrayList<Player> players;
    static int N;

    static int answer = 0;

    public void solution() {
        Collections.sort(players);
        int maxWeight = 0;
        for (Player player : players) {
            if (player.weight > maxWeight) {
                maxWeight = player.weight;
                answer++;
            }
        }
    }
    public static void main(String[] args) {
        P_09_01 problem = new P_09_01();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        players = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int height = scanner.nextInt();
            int weight = scanner.nextInt();
            players.add(new Player(height, weight));
        }
        problem.solution();
        System.out.println(answer);
    }
}
