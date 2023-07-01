package Inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P_05_07 {

    public String solution(String necessaryStudies, String studyPlan) {
        Queue<Character> queue = new LinkedList<>();
        for (char study : studyPlan.toCharArray()) {
            queue.offer(study);
        }
        for (char necessaryStudy : necessaryStudies.toCharArray()) {
            if (queue.contains(necessaryStudy)) {
                while (queue.poll() != necessaryStudy){
                }
            }else {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        P_05_07 P = new P_05_07();
        Scanner scanner = new Scanner(System.in);
        String necessaryStudies = scanner.nextLine();
        String studyPlan = scanner.nextLine();
        System.out.println(P.solution(necessaryStudies, studyPlan));
    }
}
