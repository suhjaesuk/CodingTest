package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P1715_카드정렬하기_우선순위큐 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            priorityQueue.add(Integer.parseInt(stringTokenizer.nextToken()));
        }
        int element1 = 0;
        int element2 = 0;
        int sum = 0;
        while (priorityQueue.size() > 1) {
            element1 = priorityQueue.remove();
            element2 = priorityQueue.remove();
            sum += element1 + element2;
            priorityQueue.add(element1 + element2);
        }
        System.out.println(sum);
    }
}
