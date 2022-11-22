package BaekJoon;

import java.util.Scanner;

public class P1546_평균구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        for(int i=0; i<n; i++){
            m[i]=sc.nextInt();
        }
        int max =0;
        int sum= 0;
        for(int i=0; i<n; i++) {
            if(m[i]>max) max = m[i];
            sum+=m[i];
        }
        System.out.println(sum*100.0/max/n);

    }
}
