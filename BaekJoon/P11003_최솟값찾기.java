package BaekJoon;

import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11003_최솟값찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int L = Integer.parseInt(stringTokenizer.nextToken());

        Deque<Node> deque = new LinkedList<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(stringTokenizer.nextToken());

            while(!deque.isEmpty() && deque.getLast().value > now) {
                deque.removeLast();
            }

            deque.addLast(new Node(i, now));

            if (deque.getFirst().index <= i - L) {
                deque.removeFirst();
            }
            bufferedWriter.write(deque.getFirst().value + " ");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    static class Node {
        int index;
        int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}