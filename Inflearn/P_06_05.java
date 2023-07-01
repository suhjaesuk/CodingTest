package Inflearn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class P_06_05 {

    //Set 풀이
    public String solution(int[] likeNumbers) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int likeNumber : likeNumbers) {
            hashSet.add(likeNumber);
        }
        if (hashSet.size() != likeNumbers.length) {
            return "D";
        }
        return "U";
    }

    //정렬 풀이
    public String solution1(int[] likeNumbers) {
        Arrays.sort(likeNumbers);
        for (int i = 0; i < likeNumbers.length - 1; i++) {
            if (likeNumbers[i] == likeNumbers[i + 1]) {
                return "D";
            }
        }
        return "U";
    }

    public static void main(String[] args) {
        P_06_05 P = new P_06_05();
        Scanner scanner = new Scanner(System.in);
        int totalStudent = scanner.nextInt();
        int[] likeNumbers = new int[totalStudent];
        for (int i = 0; i < totalStudent; i++) {
            likeNumbers[i] = scanner.nextInt();
        }
        System.out.println(P.solution(likeNumbers));
    }
}
