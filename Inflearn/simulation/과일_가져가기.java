package Inflearn.simulation;

import java.util.*;
class 과일_가져가기 {

    int TOTAL_BASKET = 3;

    public int solution(int[][] fruit){
        int answer = 0;
        int totalStudent = fruit.length;
        boolean[] hasTraded = new boolean[totalStudent]; // 교환한 학생
        // 1번부터 교환한다. 서로 이득이 된다면 교환
        for (int i = 0; i < totalStudent; i++) {
            for (int j = i + 1; j < totalStudent; j++) {
                // 서로 교환을 안했고 이득이 된다면
                if (!hasTraded[i] && !hasTraded[j] && profitable(fruit[i], fruit[j])) {
                    trade(fruit[i], fruit[j]);
                    hasTraded[i] = true;
                    hasTraded[j] = true;
                }
            }
        }
        for (int i = 0; i < totalStudent; i++) {
            int min = Arrays.stream(fruit[i])
                    .min()
                    .orElse(Integer.MAX_VALUE);

            answer += min;
        }
        return answer;
    }

    // 서로 이득이 되는 경우
    public boolean profitable(int[] basket1, int[] basket2) {
        int min1 = Arrays.stream(basket1)
                .min()
                .orElse(Integer.MAX_VALUE);

        int min2 = Arrays.stream(basket2)
                .min()
                .orElse(Integer.MAX_VALUE);

        int count1 = 0;
        for (int fruit : basket1) {
            if (fruit == min1) {
                count1++;
            }
        }

        int count2 = 0;
        for (int fruit : basket2) {
            if (fruit == min2) {
                count2++;
            }
        }
        for (int i = 0; i < TOTAL_BASKET; i++) {
            for (int j = 0; j < TOTAL_BASKET; j++) {
                if (i != j && basket1[i] == min1 && basket2[j] == min2 && count1 == 1 && count2 == 1 && basket1[j] != min1 + 1 && basket2[i] != min2 + 1) {
                    return true;
                }
            }
        }

        return false;
    }

    public void trade(int[] basket1, int[] basket2) {
        int min1 = Arrays.stream(basket1)
                .min()
                .orElse(Integer.MAX_VALUE);

        int min2 = Arrays.stream(basket2)
                .min()
                .orElse(Integer.MAX_VALUE);
        // 서로 가장 작은걸 + 1 한다.
        for (int i = 0; i < TOTAL_BASKET; i++) {
            if (basket1[i] == min1) {
                basket1[i]++;
            }
        }

        for (int i = 0; i < TOTAL_BASKET; i++) {
            if (basket2[i] == min2) {
                basket2[i]++;
            }
        }
    }

    public static void main(String[] args){
        과일_가져가기 T = new 과일_가져가기();
        System.out.println(T.solution(new int[][]{{10, 20, 30}, {12, 15, 20}, {20, 12, 15}, {15, 20, 10}, {10, 15, 10}}));
        System.out.println(T.solution(new int[][]{{10, 9, 11}, {15, 20, 25}}));
        System.out.println(T.solution(new int[][]{{0, 3, 27}, {20, 5, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}}));
        System.out.println(T.solution(new int[][]{{3, 7, 20}, {10, 15, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}, {12, 12, 6}, {10, 20, 0}, {5, 10, 15}}));
    }
}