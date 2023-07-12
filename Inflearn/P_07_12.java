package Inflearn;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class P_07_12 {

    static int N, direction;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] distance;
    static boolean[] check;

    public void dfs(int vertex) {
        Deque<Integer> deque = new LinkedList<>();
        check[vertex] = true;
        deque.offer(vertex);

        while(!deque.isEmpty()) {
            int currentVertex = deque.poll();
            for (int nowVertex : graph.get(currentVertex)) {
                if (!check[nowVertex]) {
                    check[nowVertex] = true;
                    deque.offer(nowVertex);
                    distance[nowVertex] = distance[currentVertex] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        P_07_12 P = new P_07_12();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        direction = scanner.nextInt();

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < direction; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            graph.get(from).add(to);
        }

        check = new boolean[N + 1];
        distance = new int[N + 1];

        P.dfs(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(i + " : " + distance[i]);
        }
    }
}
