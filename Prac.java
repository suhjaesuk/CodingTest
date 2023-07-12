import Inflearn.P_06_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Prac {

    public int count(int[] videos, int capacity) {
        int count = 1;
        int sum = 0;
        for (int video : videos) {
            if (sum + video > capacity) {
                count++;
                sum = video;
            }
            else {
                sum += video;
            }
        }
        return count;
    }

    public int solution(int n, int m, int[] videos) {
        int answer = 0;
        int left = Arrays.stream(videos).max().getAsInt();
        int right = Arrays.stream(videos).sum();
        while (left <= right) {
            int mid = (left + right) / 2;
            if (count(videos, mid) <= mid) {
                right = mid - 1;
                answer = mid;
            }else {
                left = mid + 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Prac P = new Prac();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] videos= new int[n];
        for (int i = 0; i < n; i++) {
            videos[i] = scanner.nextInt();
        }
        System.out.println(P.solution(n, m, videos));
    }
}
