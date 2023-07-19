package Inflearn.hashing;

import java.util.*;
class 같은_빈도수_만들기 {
    public int[] solution(String s){
        int[] answer = new int[5];
        HashMap<Character, Integer> alphabetCounter = new HashMap<>();
        for (char alphabet = 'a'; alphabet <= 'e'; alphabet++) {
            alphabetCounter.put(alphabet, 0);
        }

        char[] alphabets = s.toCharArray();
        for (char alphabet : alphabets) {
            alphabetCounter.put(alphabet, alphabetCounter.get(alphabet) + 1);
        }

        int max = 0;
        for (char alphabet = 'a'; alphabet <= 'e'; alphabet++) {
            if (max < alphabetCounter.get(alphabet)) {
                max = alphabetCounter.get(alphabet);
            }
        }

        int count = 0;
        for (char alphabet = 'a'; alphabet <= 'e'; alphabet++) {
            answer[count] = max - alphabetCounter.get(alphabet);
            count++;
        }
        return answer;
    }

    public static void main(String[] args){
        같은_빈도수_만들기 T = new 같은_빈도수_만들기();
        System.out.println(Arrays.toString(T.solution("aaabc")));
        System.out.println(Arrays.toString(T.solution("aabb")));
        System.out.println(Arrays.toString(T.solution("abcde")));
        System.out.println(Arrays.toString(T.solution("abcdeabc")));
        System.out.println(Arrays.toString(T.solution("abbccddee")));
    }
}

