package Programmers;

public class P_옹알이 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canSpeak = { "aya", "ye", "woo", "ma" };

        for (int i = 0; i < babbling.length; i++) {
            int count = babbling[i].length();
            for (int j = 0; j < 4; j++) {
                if (babbling[i].contains(canSpeak[j])) {
                    count -= canSpeak[j].length();
                }
            }
            if (count == 0)  answer++;
        }
        return answer;
    }
}
