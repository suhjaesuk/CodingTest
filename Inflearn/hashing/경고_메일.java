package Inflearn.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class 경고_메일 {
    public String[] solution(String[] reports, int limit){
        HashMap<String, Integer> inTimeReports = new HashMap<>();
        HashMap<String, Integer> totalTimeReports = new HashMap<>();
        for (String report : reports) {
            String[] reportArr = report.split(" ");
            String name = reportArr[0];
            int time = Integer.parseInt(reportArr[1].substring(0, 2)) * 60 + Integer.parseInt(reportArr[1].substring(3, 5));
            String type = reportArr[2];

            if (type.equals("in")) {
                inTimeReports.put(name, time);
            }

            if (type.equals("out")) {
                totalTimeReports.put(name, totalTimeReports.getOrDefault(name, 0) + time - inTimeReports.get(name));
                inTimeReports.remove(name);
            }
        }

        ArrayList<String> warningList = new ArrayList<>();

        for (String name : totalTimeReports.keySet()) {
            if (totalTimeReports.get(name) > limit) {
                warningList.add(name);
            }
        }

        Collections.sort(warningList);

        return warningList.toArray(new String[0]);
    }

    public static void main(String[] args){
        경고_메일 T = new 경고_메일();
        System.out.println(Arrays.toString(T.solution(new String[]{"john 09:30 in", "daniel 10:05 in", "john 10:15 out", "luis 11:57 in", "john 12:03 in", "john 12:20 out", "luis 12:35 out", "daniel 15:05 out"}, 60)));
        System.out.println(Arrays.toString(T.solution(new String[]{"bill 09:30 in", "daniel 10:00 in", "bill 11:15 out", "luis 11:57 in", "john 12:03 in", "john 12:20 out", "luis 14:35 out", "daniel 14:55 out"}, 120)));
        System.out.println(Arrays.toString(T.solution(new String[]{"cody 09:14 in", "bill 09:25 in", "luis 09:40 in", "bill 10:30 out", "cody 10:35 out", "luis 10:35 out", "bill 11:15 in", "bill 11:22 out", "luis 15:30 in", "luis 15:33 out"}, 70)));
        System.out.println(Arrays.toString(T.solution(new String[]{"chato 09:15 in", "emilly 10:00 in", "chato 10:15 out", "luis 10:57 in", "daniel 12:00 in", "emilly 12:20 out", "luis 11:20 out", "daniel 15:05 out"}, 60)));
    }
}
