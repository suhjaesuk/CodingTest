package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1715_카드정렬하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = scanner.nextInt();
        }
        int count = 0;
        int sum = cards[0];
        Arrays.sort(cards);
        for (int i = 1; i < N; i++) {
            sum += cards[i];
            count += sum;
        }
        System.out.println(count);
    }
}
