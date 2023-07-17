package Inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick> {
    int surface;
    int height;
    int weight;

    public Brick(int surface, int height, int weight) {
        this.surface = surface;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Brick o) {
        return o.surface - this.surface;
    }
}
public class P_10_04 {
    static int[] memo;
    static int N;
    static ArrayList<Brick> bricks;

    public int solution() {
        int answer = 0;
        Collections.sort(bricks);
        memo[0] = bricks.get(0).height;
        for (int i = 1; i < N; i++) {
            int max = 0;
            for (int j = i; j >= 0; j--) {
                if (bricks.get(j).weight > bricks.get(i).weight && memo[j] > max) {
                    max = memo[j];
                }
            }
            memo[i] = max + bricks.get(i).height;
            answer = Math.max(answer, memo[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        P_10_04 problem = new P_10_04();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        bricks = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int surface = scanner.nextInt();
            int height = scanner.nextInt();
            int weight = scanner.nextInt();

            bricks.add(new Brick(surface, height, weight));
        }
        memo = new int[N];
        System.out.println(problem.solution());
    }
}
