package Programmers;
import java.util.*;

public class P_문자열_내_마음대로_정렬하기 {
    class Solution {
        public String[] solution(String[] strings, int n) {
            Arrays.sort(strings);
            String[] answer = new String[strings.length];

            for(int i = 0; i < strings.length; i++) {
                answer[i] = strings[i].substring(n, n+1);
            }
            Arrays.sort(answer);

            List<String> list = new ArrayList<>(Arrays.asList(strings));
            for(int i = 0; i < strings.length; i++) {
                for(int j = 0; j < list.size(); j++) {
                    if(list.get(j).substring(n, n+1).equals(answer[i])) {
                        answer[i] = list.get(j);
                        list.remove(list.get(j));
                        break;
                    }
                }
            }

            return answer;
        }
    }
}
