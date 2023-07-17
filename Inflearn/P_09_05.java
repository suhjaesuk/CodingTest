package Inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    int vertex;
    int value;

    public Edge(int vertex, int value) {
        this.vertex = vertex;
        this.value = value;
    }

    @Override
    public int compareTo(Edge o) {
        return this.value - o.value;
    }
}

public class P_09_05 {
    static int edge;
    static int vertex;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] answer;

    public void solution(int vertex) {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Edge(vertex, 0));
        answer[vertex] = 0;
        while (!priorityQueue.isEmpty()) {
            Edge currentEdge = priorityQueue.poll();
            int currentVertex = currentEdge.vertex;
            int currentValue = currentEdge.value;
            if (currentValue > answer[currentVertex]) {
                continue;
            }
            for (Edge edge : graph.get(currentVertex)) {
                if (answer[edge.vertex] > currentValue + edge.value) {
                    answer[edge.vertex] = currentValue + edge.value;
                    priorityQueue.offer(new Edge(edge.vertex, currentValue + edge.value));
                }
            }
        }
    }

    public static void main(String[] args) {
        P_09_05 problem = new P_09_05();
        Scanner scanner = new Scanner(System.in);
        edge = scanner.nextInt();
        vertex = scanner.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= edge; i++) {
            graph.add(new ArrayList<Edge>());
        }
        answer = new int[edge + 1];
        Arrays.fill(answer, Integer.MAX_VALUE);
        for (int i = 0; i < vertex; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int value = scanner.nextInt();
            graph.get(start).add(new Edge(end, value));
        }
        problem.solution(1);

        for (int i = 2; i <= edge; i++) {
            if (answer[i] != Integer.MAX_VALUE) {
                System.out.println(i + " : " + answer[i]);
            } else {
                System.out.println(i + " : " + "impossible");
            }
        }
    }
}
