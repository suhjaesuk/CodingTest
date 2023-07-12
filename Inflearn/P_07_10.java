package Inflearn;

import java.util.Scanner;

public class P_07_10 {
    static int N,direction;
    static int answer = 0;
    static int[][] graph;
    static boolean[] check;
    static int start = 1;
    static int end = 5;

    public void dfs(int V) {
        if (V == end) {
            answer++;
        } else {
            for (int i = 1; i <= N; i++) {
                if (graph[V][i] == 1 && !check[i]) {
                    check[i] = true;
                    dfs(i);
                    check[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        P_07_10 P = new P_07_10();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        direction = scanner.nextInt();
        graph = new int[N + 1][N + 1];
        check = new boolean[N + 1];
        for (int i = 0; i < direction; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            graph[from][to] = 1;
        }
        check[1] = true;
        P.dfs(start);
        System.out.println(answer);
    }
}
