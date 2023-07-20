package Inflearn.hashing;

import java.util.*;
class Suspect implements Comparable<Suspect>{
    int time;
    String name;

    public Suspect(int time, String name) {
        this.time = time;
        this.name = name;
    }

    @Override
    public int compareTo(Suspect o) {
        return this.time - o.time;
    }
}

class 문서_도난 {
    public String[] solution(String[] reports, String times){
        PriorityQueue<Suspect> suspects = new PriorityQueue<>();
        String[] timesArr = times.split(" ");
        int start = Integer.parseInt(timesArr[0].substring(0, 2) + timesArr[0].substring(3, 5));
        int end = Integer.parseInt(timesArr[1].substring(0, 2) + timesArr[1].substring(3, 5));
        for (String report : reports) {
            String[] reportArr = report.split(" ");
            String worker = reportArr[0];

            int time = Integer.parseInt(reportArr[1].substring(0, 2) + reportArr[1].substring(3, 5));
            if (start <= time && time <= end) {
                suspects.offer(new Suspect(time, worker));
            }
        }

        String[] answer = new String[suspects.size()];
        for (int i = 0; i < suspects.size(); i++) {
            answer[i] = suspects.poll().name;
        }
        return answer;
    }

    public static void main(String[] args){
        문서_도난 T = new 문서_도난();
        System.out.println(Arrays.toString(T.solution(new String[]{"john 15:23", "daniel 09:30", "tom 07:23", "park 09:59", "luis 08:57"}, "08:33 09:45")));
        System.out.println(Arrays.toString(T.solution(new String[]{"ami 12:56", "daniel 15:00", "bob 19:59", "luis 08:57", "bill 17:35", "tom 07:23", "john 15:23", "park 09:59"}, "15:01 19:59")));
        System.out.println(Arrays.toString(T.solution(new String[]{"cody 14:20", "luis 10:12", "alice 15:40", "tom 15:20", "daniel 14:50"}, "14:20 15:20")));
    }
}
