package Inflearn;

import java.util.Scanner;

public class P_01_01 {

    public int solution(String string, char alphabet) {
        int count = 0;
        string = string.toUpperCase();
        alphabet = Character.toUpperCase(alphabet);
        for (char c : string.toCharArray()) {
            if (c == alphabet) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        P_01_01 P = new P_01_01();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        char alphabet = scanner.next().charAt(0);
        System.out.println(P.solution(string, alphabet));
    }
}
