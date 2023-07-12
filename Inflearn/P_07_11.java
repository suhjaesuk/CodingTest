package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class P_07_11 {
    static ArrayList<ArrayList<Integer>> graph;

    static int N, direction, answer = 0;

    static boolean[] check;

    static final int start = 1;

    static final int end = 5;

    public void dfs(int value) {
        if (value == end) {
            answer++;
        }else {
            for (int nextValue : graph.get(value)) {
                if (!check[nextValue]) {
                    check[nextValue] = true;
                    dfs(nextValue);
                    check[nextValue] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        P_07_11 P = new P_07_11();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        direction = scanner.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        check = new boolean[N + 1];
        for (int i = 0; i < direction; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            graph.get(from).add(to);
        }
        check[1] = true;
        P.dfs(start);
        System.out.println(answer);
    }
}
