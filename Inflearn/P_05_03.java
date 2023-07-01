package Inflearn;

import java.util.Scanner;
import java.util.Stack;

public class P_05_03 {
    //0은 빈칸
    //바구니에 같은 것은 터뜨리고 카운트

    public int solution(Stack<Integer>[] boards, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int answer = 0;
        for (int move : moves) {
            if (boards[move].isEmpty()) {
                continue;
            }else {
                int doll = boards[move].pop();
                if (!basket.isEmpty() && basket.peek() == doll) {
                    basket.pop();
                    answer += 2;
                }else {
                    basket.push(doll);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P_05_03 P = new P_05_03();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Stack<Integer>[] boards = new Stack[N + 1];
        for (int i = 1; i <= N; i++) {
            boards[i] = new Stack<>();
            for (int j = 0; j < N; j++) {
                int now = scanner.nextInt();
                if (now == 0) {
                    continue;
                }else {
                    boards[i].push(now);
                }
            }
        }
        int M = scanner.nextInt();
        int[] moves = new int[M];
        for (int i = 0; i < M; i++) {
            moves[i] = scanner.nextInt();
        }
        System.out.println(P.solution(boards, moves));
    }
}