import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Prac {

    public ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int element : arr1) {
            priorityQueue.add(element);
        }
        for (int element : arr2) {
            priorityQueue.add(element);
        }
        int beforeElement = 0;
        while (!priorityQueue.isEmpty()) {
            int nowElement = priorityQueue.poll();
            if (beforeElement == nowElement) {
                answer.add(nowElement);
            }
            beforeElement = nowElement;
        }
        return answer;
    }

    public static void main(String[] args) {
        Prac P = new Prac();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }

        ArrayList<Integer> answers = P.solution(arr1, arr2);
        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }
}
