package Inflearn;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Vertex1 implements Comparable<Vertex1> {
    int edge;
    int cost;

    public Vertex1(int edge, int cost) {
        this.edge = edge;
        this.cost = cost;
    }

    @Override
    public int compareTo(Vertex1 o) {
        return this.cost - o.cost;
    }
}
public class P_09_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        ArrayList<ArrayList<Vertex1>> vertexes = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            vertexes.add(new ArrayList<>());
        }
        boolean[] visit = new boolean[N + 1];
        for (int i = 0; i < M; i++) {
            int edgeA = scanner.nextInt();
            int edgeB = scanner.nextInt();
            int cost = scanner.nextInt();
            vertexes.get(edgeA).add(new Vertex1(edgeB, cost));
            vertexes.get(edgeB).add(new Vertex1(edgeA, cost));
        }
        int answer = 0;
        PriorityQueue<Vertex1> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Vertex1(5, 0));
        while(!priorityQueue.isEmpty()) {
            Vertex1 currentVertex = priorityQueue.poll();
            int currentEdge = currentVertex.edge;
            int currentCost = currentVertex.cost;
            if (!visit[currentEdge]) {
                visit[currentEdge] = true;
                answer += currentCost;
                for (Vertex1 vertex : vertexes.get(currentEdge)) {
                    if (!visit[vertex.edge]) {
                        priorityQueue.offer(new Vertex1(vertex.edge, vertex.cost));
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
