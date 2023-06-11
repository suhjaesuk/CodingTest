package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1377_버블소트프로그램1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Data[] data = new Data[N];
        for (int i = 0; i < N; i++) {
            data[i] = new Data(scanner.nextInt(), i);
        }
        Arrays.sort(data);
        int max = 0;
        for (int i =0; i < N; i++) {
            if (max < data[i].index - i) {
                max = data[i].index - i;
            }
        }
        System.out.println(max + 1);
    }

    static class Data{
        int value;
        int index;

        public Data(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
