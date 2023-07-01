package Inflearn;

import java.util.Scanner;

public class P_01_10 {

    public int[] solution(String word, char alphabet) {
        char[] alphabets = word.toCharArray();
        int[] distances = new int[alphabets.length]; //alphabet 과의 거리를 저장하는 배열
        int distance = 0;
        for (int i = 0; i < alphabets.length; i++) {
            if (alphabet == alphabets[i]) {
                distance = 0;
            }else {
                distance++;
            }
            distances[i] = distance;
        }

        for (int i = alphabets.length - 1; i >= 0; i--) {
            if (alphabet == alphabets[i]) {
                distance = 0;
            }else {
                distance++;
            }
            if (distances[i] > distance) {
                distances[i] = distance;
            }
        }
        return distances;
    }
    public static void main(String[] args) {
        P_01_10 P = new P_01_10();
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char alphabet = scanner.next().charAt(0);
        int[] answers = P.solution(word, alphabet);
        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }
}

