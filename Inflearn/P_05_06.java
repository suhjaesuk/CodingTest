package Inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P_05_06 {

    public int solution(Queue<Integer> queue, int K) {
        int count = 1;
        while (queue.size() > 1) {
            if (count == K) {
                queue.remove();
                count = 1;
            }else {
                int nowPrince = queue.poll();
                queue.offer(nowPrince);
                count++;
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        P_05_06 P = new P_05_06();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int prince = 1; prince <= N; prince++) {
            queue.add(prince);
        }
        int K = scanner.nextInt();
        System.out.println(P.solution(queue, K));
    }
}
