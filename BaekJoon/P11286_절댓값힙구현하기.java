package BaekJoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P11286_절댓값힙구현하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int firstValue = Math.abs(o1);
            int secondValue = Math.abs(o2);
            if (firstValue == secondValue) {
                return o1 > o2 ? 1 : -1;
            } else {
                return firstValue - secondValue;
            }
        });

        for (int i = 0; i < N; i++) {
            int now = scanner.nextInt();
            if (now == 0) {
                if (queue.isEmpty()) {
                    System.out.println("0");
                }else {
                    System.out.println(queue.poll());
                }
            }else{
                queue.add(now);
            }
        }
    }
}
