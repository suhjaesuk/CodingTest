package Inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Vertex implements Comparable<Vertex> {
    public int edgeA;
    public int edgeB;
    public int cost;

    public Vertex(int edgeA, int edgeB, int cost) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.cost = cost;
    }

    @Override
    public int compareTo(Vertex o) {
        return this.cost - o.cost;
    }
}
public class P_09_07 {
    static int[] memo;
    public static int find(int vertex) {
        if (vertex == memo[vertex]) {
            return vertex;
        }
        return memo[vertex] = find(memo[vertex]);
    }
    public static void union(int edgeA, int edgeB) {
        int findA = find(edgeA);
        int findB = find(edgeB);
        if (findA != findB) {
            memo[findA] = findB;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        memo = new int[N + 1];
        ArrayList<Vertex> vertexes = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            memo[i] = i;
        }
        for (int i = 0; i < M; i++) {
            int edgeA = scanner.nextInt();
            int edgeB = scanner.nextInt();
            int cost = scanner.nextInt();
            vertexes.add(new Vertex(edgeA, edgeB, cost));
        }
        int answer = 0;
        Collections.sort(vertexes);
        for (Vertex vertex : vertexes) {
            int findVertexA = find(vertex.edgeA);
            int findVertexB = find(vertex.edgeB);
            if (findVertexA != findVertexB) {
                answer += vertex.cost;
                union(vertex.edgeA, vertex.edgeB);
            }
        }
        System.out.println(answer);
    }
}
