package Inflearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class P_04_03 {

    //HashSet 풀이
    public ArrayList<Integer> solution(int totalSales, int k, int[] salesRecord) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = k - 1; i < totalSales; i++) {
            HashSet<Integer> salesType = new HashSet<>();
            for (int j = i - k + 1; j <= i; j++) {
                salesType.add(salesRecord[j]);
            }
            answer.add(salesType.size());
        }
        return answer;
    }

    //HashMap 풀이
    public ArrayList<Integer> solution1(int totalSales, int k, int[] salesRecord) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> salesScore = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            salesScore.put(salesRecord[i], salesScore.getOrDefault(salesRecord[i], 0) + 1);
        }
        int left = 0;
        for (int right = k - 1; right < totalSales; right++) {
            salesScore.put(salesRecord[right], salesScore.getOrDefault(salesRecord[right], 0) + 1);
            answer.add(salesScore.size());
            salesScore.put(salesRecord[left], salesScore.get(salesRecord[left]) - 1);
            if (salesScore.get(salesRecord[left]) == 0) {
                salesScore.remove(salesRecord[left]);
            }
            left++;
        }
        return answer;
    }

    public static void main(String[] args) {
        P_04_03 P = new P_04_03();
        Scanner scanner = new Scanner(System.in);
        int totalSales = scanner.nextInt();
        int k = scanner.nextInt();
        int[] salesRecord = new int[totalSales];
        for (int i = 0; i < totalSales; i++) {
            salesRecord[i] = scanner.nextInt();
        }
        System.out.println(P.solution1(totalSales, k, salesRecord));
    }
}
