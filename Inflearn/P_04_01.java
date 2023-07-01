package Inflearn;

import java.util.HashMap;
import java.util.Scanner;

public class P_04_01 {

    public String solution(HashMap<String, Integer> votingResult) {
        String selector = "";
        int max = 0;
        for (String candidate : votingResult.keySet()) {
                int voteWithCandidate = votingResult.get(candidate);
                if (max < voteWithCandidate) {
                    max = voteWithCandidate;
                    selector = candidate;
                }
        }
        return selector;
    }

    public static void main(String[] args) {
        P_04_01 P = new P_04_01();
        Scanner scanner = new Scanner(System.in);
        int totalVote = scanner.nextInt();
        HashMap<String, Integer> votingResult = new HashMap<>();
        for (int i = 0; i < totalVote; i++) {
            String vote = scanner.next();
            votingResult.put(vote, votingResult.getOrDefault(vote, 0) + 1);
        }
        System.out.println(P.solution(votingResult));
    }
}
