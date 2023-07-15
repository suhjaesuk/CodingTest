package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class P_08_14 {

    static int N, M;
    static int pizzaShopCount;
    static int answer = Integer.MAX_VALUE;
    static int[] combination;
    static final int HOUSE = 1;
    static final int PIZZA_SHOP = 2;
    static ArrayList<Point> houseList;
    static ArrayList<Point> pizzaList;

    public void dfs(int level, int s) {
        if (level == M) {
            int sum = 0;
            for (Point house : houseList) {
                int distance = Integer.MAX_VALUE;
                for (int i : combination) {
                    distance = Math.min(distance, Math.abs(house.x - pizzaList.get(i).x) + Math.abs(house.y - pizzaList.get(i).y));
                }
                sum += distance;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < pizzaShopCount; i++) {
                combination[level] = i;
                dfs(level + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        P_08_14 problem = new P_08_14();
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        houseList = new ArrayList<>();
        pizzaList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int temp = scanner.nextInt();
                if (temp == HOUSE) {
                    houseList.add(new Point(i, j));
                }else if (temp == PIZZA_SHOP) {
                    pizzaList.add(new Point(i, j));
                }
            }
        }
        pizzaShopCount = pizzaList.size();
        combination = new int[M];
        problem.dfs(0, 0);
        System.out.println(answer);

    }
}
