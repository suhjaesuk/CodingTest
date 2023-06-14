package BaekJoon;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P1744_수묶기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        PriorityQueue<Integer> plusPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPriorityQueue = new PriorityQueue<>();

        int sum = 0;
        int zeroCount = 0;
        for (int i = 0; i < N; i++) {
            int now = scanner.nextInt();

            if (now > 1) {
                plusPriorityQueue.add(now);
            }else if (now == 1) {
                sum += now;
            }else if (now == 0) {
                zeroCount++;
            }else {
                minusPriorityQueue.add(now);
            }
        }

        while (plusPriorityQueue.size() > 1) {
            int firstElement = plusPriorityQueue.remove();
            int secondElement = plusPriorityQueue.remove();
            sum += firstElement * secondElement;
        }
        if (!plusPriorityQueue.isEmpty()) {
            sum += plusPriorityQueue.remove();
        }

        while (minusPriorityQueue.size() > 1) {
            int firstElement = minusPriorityQueue.remove();
            int secondElement = minusPriorityQueue.remove();
            sum += firstElement * secondElement;
        }
        if (!minusPriorityQueue.isEmpty()) {
            if (zeroCount == 0) {
                sum += minusPriorityQueue.remove();
            }
        }

        System.out.println(sum);
    }
}
