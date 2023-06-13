package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P13023_친구관게파악하기 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static boolean arrive;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        visited = new boolean[N];
        graph = new ArrayList[N+1];
        arrive = false;
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            graph[start].add(end);
            graph[end].add(start);
        }

        for (int i = 0; i < N; i++) {
            DFS(i, 1);
            if (arrive) {
                break;
            }
        }

        if (arrive) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }

    static void DFS(int value, int depth) {
        if (depth == 5) {
            arrive = true;
            return;
        }

        visited[value] = true;
        for (int i : graph[value]) {
            if (!visited[i]) {
                DFS(i, depth + 1);
            }
        }
    }
}

