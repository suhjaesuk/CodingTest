package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1260_DFS와BFS프로그램 {

    static boolean[] DFSvisited;
    static boolean[] BFSvisited;
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int startPoint = Integer.parseInt(stringTokenizer.nextToken());

        DFSvisited = new boolean[N+1];
        BFSvisited = new boolean[N+1];
        graph = new ArrayList[N+1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 1; i <= M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int startNode = Integer.parseInt(stringTokenizer.nextToken());
            int endNode = Integer.parseInt(stringTokenizer.nextToken());
            graph[startNode].add(endNode);
            graph[endNode].add(startNode);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        DFS(startPoint);
        System.out.println();
        BFS(startPoint);
    }

    static void DFS(int value) {
        if (DFSvisited[value]) {
            return;
        }
        DFSvisited[value] = true;
        System.out.print(value + " ");
        for (int i : graph[value]) {
            if (!DFSvisited[i]) {
                DFS(i);
            }
        }
    }

    static void BFS(int value) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(value);
        BFSvisited[value] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            System.out.print(now + " ");
            for (int i : graph[now]) {
                if (!BFSvisited[i]) {
                    BFSvisited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
