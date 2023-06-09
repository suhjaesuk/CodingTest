import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Prac {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        Deque<Node> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int now = scanner.nextInt();

            while (!deque.isEmpty() && deque.getLast().value > now) {
                deque.removeLast();
            }
            deque.addLast(new Node(now, i));

            if (deque.getFirst().index <= i - L) {
                deque.removeFirst();
            }
            stringBuilder.append(deque.getFirst().value + " ");
        }
        String answer = stringBuilder.toString();
        System.out.println(answer);

    }

    static class Node {
        public int value;
        public int index;

        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
