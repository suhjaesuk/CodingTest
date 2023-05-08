package Programmers;

import java.util.HashMap;

public class P_추억점수 {

    public int[] solution(String[] name, int[] yearning, String[][] photos) {
        int[] answer = {};
        HashMap<String, Integer> scoreMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photos.length; i++) {
            for (int j = 0; j < photos[i].length; j++) {

                if (scoreMap.containsKey(photos[i][j])) answer[i] += scoreMap.get(photos[i][j]);
            }
        }
        return answer;
    }
}
