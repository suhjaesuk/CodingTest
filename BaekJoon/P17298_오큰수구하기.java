package BaekJoon;

import java.util.Scanner;

public class P17298_오큰수구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean result = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    System.out.print(arr[j] + " ");
                    result = true;
                    break;
                }
            }
            if(!result) {
                System.out.print(-1 + " ");
            }
        }
    }
}
