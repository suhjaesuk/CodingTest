package Inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P_03_02 {

    public ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int point1 = 0;
        int point2 = 0;

        while (point1 < arr1.length && point2 < arr2.length) {
            if (arr1[point1] < arr2[point2]) {
                point1++;
            }else if (arr1[point1] > arr2[point2]) {
                point2++;
            }else if (arr1[point1] == arr2[point2]) {
                answer.add(arr1[point1]);
                point1++;
                point2++;
            }
        }
        return answer;
    }

    //우선순위 큐 풀이
    public ArrayList<Integer> solution1(int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int element : arr1) {
            priorityQueue.add(element);
        }
        for (int element : arr2) {
            priorityQueue.add(element);
        }
        int beforeElement = 0;
        while (!priorityQueue.isEmpty()) {
            int nowElement = priorityQueue.poll();
            if (beforeElement == nowElement) {
                answer.add(nowElement);
            }
            beforeElement = nowElement;
        }
        return answer;
    }

    public static void main(String[] args) {
        P_03_02 P = new P_03_02();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }

        ArrayList<Integer> answers = P.solution(arr1, arr2);
        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }
}
