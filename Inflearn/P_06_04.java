package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class P_06_04 {

    // MISS 일 경우 -> 끝에서 부터 cache[i - 1] = cache[i] , cache[0] = process
    // HIT 일 경우 -> HIT 위치에서 부터  cache[i - 1] = cache[i] , cache[0] = process

    public int[] solution(int size, int[] processes) {
        int[] cache = new int[size];
        for (int process : processes) {
            int position = -1;
            for (int i = 0 ; i < size; i++) {
                if (process == cache[i]) {
                    position = i;
                }
            } if (position == -1) { //MISS
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i -1];
                }
            } else { //HIT
                for (int i = position; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = process;
        }
        return cache;
    }

    public static void main(String[] args) {
        P_06_04 P = new P_06_04();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int totalProcess = scanner.nextInt();
        int[] processes = new int[totalProcess];
        for (int i = 0; i < totalProcess; i++) {
            processes[i] = scanner.nextInt();
        }
        int[] answer = P.solution(size, processes);
        for (int x : answer) {
            System.out.println(x + " ");
        }
    }
}
