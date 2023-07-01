package Inflearn;

import java.util.Scanner;

public class P_01_05 {

    public String solution(String word) {
        char[] alphabets = word.toCharArray();
        int left = 0;
        int right = alphabets.length - 1;
        while (left < right) {
            if (!Character.isAlphabetic(alphabets[left])) {
                left++;
            }
            else if (!Character.isAlphabetic(alphabets[right])) {
                right--;
            } else {
                char tmp = alphabets[left];
                alphabets[left] = alphabets[right];
                alphabets[right] = tmp;
                left++;
                right--;
            }
        }
        String reversedWord = String.valueOf(alphabets);
        return reversedWord;
    }

    public static void main(String[] args) {
        P_01_05 P = new P_01_05();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(P.solution(word));
    }
}
