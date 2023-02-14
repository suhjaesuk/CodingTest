package Inflearn;

import java.util.Scanner;

public class P_01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next().toUpperCase();
        char c = sc.next().charAt(0);
        c = Character.toUpperCase(c);
        int count = 0;

        for(int i=0; i<S.length(); i++) {
            if (S.charAt(i)==c) {
                count++;
            }

        }
        System.out.println(count);

    }
}
