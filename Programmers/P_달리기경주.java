package Programmers;

import java.util.HashMap;
import java.util.Map;

class P_달리기경주 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }

        for (String calling : callings) {
            int rank = playerMap.get(calling);
            playerMap.put(calling, rank - 1);
            playerMap.put(players[rank - 1], rank);
            players[rank] = players[rank - 1];
            players[rank - 1] = calling;
        }

        return players;
    }
}
