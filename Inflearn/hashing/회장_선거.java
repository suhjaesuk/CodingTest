package Inflearn.hashing;

import java.util.*;
class 회장_선거 {
    public String solution(String[] votes, int k){
        String answer = "~";
        HashMap<String, ArrayList<String>> voteMap = new HashMap<>();
        for (String vote : votes) {
            String[] temp = vote.split(" ");
            String elector = temp[1];
            String voter = temp[0];
            voteMap.computeIfAbsent(elector, i -> new ArrayList<>()).add(voter);
        }

        HashMap<String, Integer> voterScore = new HashMap<>();
        for (String elector : voteMap.keySet()) {
            ArrayList<String> voters = voteMap.get(elector);
            if (voters.size() >= k) {
                for (String voter : voters) {
                    voterScore.put(voter, voterScore.getOrDefault(voter, 0) + 1);
                }
            }
        }

        int max = 0;
        for (String voter : voterScore.keySet()) {
            int score = voterScore.get(voter);
            if (max < score) {
                max = score;
                answer = voter;
            } else if (max <= score && voter.compareTo(answer) < 0) {
                max = score;
                answer = voter;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        회장_선거 T = new 회장_선거();
        System.out.println(T.solution(new String[]{"john tom", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
        System.out.println(T.solution(new String[]{"john tom", "park luis", "john luis", "luis tom", "park tom", "luis john", "luis park", "park john", "john park", "tom john", "tom park", "tom luis"}, 2));
        System.out.println(T.solution(new String[]{"cody tom", "john tom", "cody luis", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
        System.out.println(T.solution(new String[]{"bob tom", "bob park", "park bob", "luis park", "daniel luis", "luis bob", "park luis", "tom bob", "tom luis", "john park", "park john"}, 3));
    }
}