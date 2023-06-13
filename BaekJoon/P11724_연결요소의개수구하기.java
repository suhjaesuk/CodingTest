package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11724_연결요소의개수구하기 {

    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];
        for (int i = 1; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            graph[start].add(end);
            graph[end].add(start);
        }
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                answer++;
                DFS(i);
            }
        }
        System.out.println(answer);
    }

    static void DFS(int value) {
        if (visited[value]) {
            return;
        }
        visited[value] = true;
        for (int i : graph[value]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}
