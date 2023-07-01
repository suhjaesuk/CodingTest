package Inflearn;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class P_04_02 {

    public String solution(HashMap<Character, Integer> alphabetsScore1, HashMap<Character, Integer> alphabetsScore2) {
        String answer = "YES";
        if (alphabetsScore1.size() != alphabetsScore2.size()) {
            answer = "NO";
        }
        for (char alphabet : alphabetsScore1.keySet()) {
            if (!alphabetsScore2.containsKey(alphabet) && alphabetsScore1.get(alphabet) != alphabetsScore2.get(alphabet)) {
                answer = "NO";
            }
        }
        return answer;

    }
    public static void main(String[] args) {
        P_04_02 P = new P_04_02();
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        char[] alphabets1 = word1.toCharArray();
        String word2 = scanner.next();
        char[] alphabets2 = word2.toCharArray();

        HashMap<Character, Integer> alphabetsScore1 = new HashMap<>();
        for (char alphabet : alphabets1) {
            alphabetsScore1.put(alphabet, alphabetsScore1.getOrDefault(alphabet, 0) + 1);
        }
        HashMap<Character, Integer> alphabetsScore2 = new HashMap<>();
        for (char alphabet : alphabets2) {
            alphabetsScore2.put(alphabet, alphabetsScore2.getOrDefault(alphabet, 0) + 1);
        }
        System.out.println(P.solution(alphabetsScore1, alphabetsScore2));
    }
}
