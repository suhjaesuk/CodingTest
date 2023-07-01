package Inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class P_04_05 {

    public int solution(int totalCard, int k, int[] cards) {
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < totalCard; i++) {
            for (int j = i + 1; j < totalCard; j++) {
                for (int m = j + 1; m < totalCard; m++) {
                    int sum = cards[i] + cards[j] + cards[m];
                    treeSet.add(sum);
                }
            }
        }
        int index = 0;
        int answer = 0;
        for (int element : treeSet) {
            if (index == k - 1) {
                answer = element;
            }
            index++;
        }

        if (index < k - 1) {
            return -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        P_04_05 P = new P_04_05();
        Scanner scanner = new Scanner(System.in);
        int totalCard = scanner.nextInt();
        int k = scanner.nextInt();
        int[] cards = new int[totalCard];
        for (int i = 0; i < totalCard; i++) {
            cards[i] = scanner.nextInt();
        }
        System.out.println(P.solution(totalCard, k, cards));
    }
}
