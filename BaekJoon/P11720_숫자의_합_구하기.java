package BaekJoon;

import java.util.Scanner;

public class P11720_숫자의_합_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str =sc.next();
        char[] c = str.toCharArray();
        int sum=0;
        for(int i=0; i<n; i++) {
            sum+=c[i]-'0';
        }
        System.out.println(sum);

    }
}
