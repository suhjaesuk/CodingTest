package Inflearn;

import java.util.HashMap;
import java.util.Scanner;

public class P_04_04 {

    public int solution(String word, String anagrams) {
        int anagramSize = anagrams.length();
        HashMap<Character, Integer> anagramScore = new HashMap<>();
        for (char anagram : anagrams.toCharArray()) {
            anagramScore.put(anagram, anagramScore.getOrDefault(anagram, 0) + 1);
        }

        char[] alphabets = word.toCharArray();
        HashMap<Character, Integer> alphabetScore = new HashMap<>();
        for (int i = 0; i < anagramSize - 1; i++) {
            alphabetScore.put(alphabets[i], alphabetScore.getOrDefault(alphabets[i], 0) + 1);
        }

        int answer = 0;
        int left = 0;
        for (int right = anagramSize - 1; right < word.length(); right++) {
            alphabetScore.put(alphabets[right], alphabetScore.getOrDefault(alphabets[right], 0) + 1);
            if (alphabetScore.equals(anagramScore)) {
                answer++;
            }
            alphabetScore.put(alphabets[left], alphabetScore.get(alphabets[left]) - 1);
            if (alphabetScore.get(alphabets[left]) == 0) {
                alphabetScore.remove(alphabets[left]);
            }
            left++;
        }
        return answer;
    }

    public static void main(String[] args) {
        P_04_04 P = new P_04_04();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String anagrams = scanner.nextLine();
        System.out.println(P.solution(word, anagrams));
    }
}
