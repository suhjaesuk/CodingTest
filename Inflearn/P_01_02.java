package Inflearn;

import java.util.Scanner;

public class P_01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Str = sc.next();
        String answer ="";
        for(char c :Str.toCharArray()){
            if(Character.isUpperCase(c)){
                answer+=Character.toLowerCase(c);
            }else {answer +=Character.toUpperCase(c);
            }
        }System.out.print(answer);
    }
}
