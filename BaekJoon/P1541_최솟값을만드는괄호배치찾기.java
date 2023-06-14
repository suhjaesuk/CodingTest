package BaekJoon;

import java.util.Scanner;

public class P1541_최솟값을만드는괄호배치찾기 {

    static int answer = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exams = scanner.nextLine();
        String[] str = exams.split("-");
        for (int i = 0; i < str.length; i++) {
            int temp = sumNumbers(str[i]);
            if (i == 0) {
                answer += temp;
            }else {
                answer -= temp;
            }
        }
    }

    static int sumNumbers(String str) {
        int sum = 0;
        String temp[] = str.split("[+]");
        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
