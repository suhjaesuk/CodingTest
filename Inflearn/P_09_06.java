package Inflearn;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class P_09_06 {
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
        for (int i = 1; i <= N; i++) {
            memo[i] = i;
        }
        for (int i = 1; i <= M; i++) {
            int studentA = scanner.nextInt();
            int studentB = scanner.nextInt();
            union(studentA, studentB);
        }
        int studentA = scanner.nextInt();
        int studentB = scanner.nextInt();
        int findA = find(studentA);
        int findB = find(studentB);
        if (findA == findB) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
