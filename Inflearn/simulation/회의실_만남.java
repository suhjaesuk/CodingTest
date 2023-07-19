package Inflearn.simulation;

import java.util.*;
class 회의실_만남 {
    public int[] solution(int[] enter, int[] exit){
        int totalWorker = enter.length;
        int[] answer = new int[totalWorker];

        // 나갈사람들
        Deque<Integer> exitWorkers = new LinkedList<>();
        for (int exitWorker : exit) {
            exitWorkers.offer(exitWorker);
        }

        // 만난 사람들을 검증하는 배열
        boolean[][] hasMeet = new boolean[totalWorker + 1][totalWorker + 1];
        for (int self = 0; self <= totalWorker; self++) {
            // 자기 자신과는 만날 수 없다.
            hasMeet[self][self] = true;
        }

        // 회의실에 있는 사람들
        Set<Integer> workersInMeetingRoom = new HashSet<>();
        while (!exitWorkers.isEmpty()) {
            for (int enterWorker : enter) {
                workersInMeetingRoom.add(enterWorker);

                for (int workerInMeetingRoom : workersInMeetingRoom) {
                    if (!hasMeet[workerInMeetingRoom][enterWorker]) {
                        answer[enterWorker - 1]++;
                        answer[workerInMeetingRoom - 1]++;
                        hasMeet[workerInMeetingRoom][enterWorker] = true;
                        hasMeet[enterWorker][workerInMeetingRoom] = true;
                    }
                }

                while (workersInMeetingRoom.contains(exitWorkers.peek())) {
                    int exitWorker = exitWorkers.poll();
                    workersInMeetingRoom.remove(exitWorker);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        회의실_만남 T = new 회의실_만남();
        System.out.println(Arrays.toString(T.solution(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 2, 5, 3, 4}, new int[]{2, 3, 1, 4, 5})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 3, 2, 4, 5, 7, 6, 8}, new int[]{2, 3, 5, 6, 1, 4, 8, 7})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 4, 7, 2, 3, 5, 6}, new int[]{5, 2, 6, 1, 7, 3, 4})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 4, 2, 3}, new int[]{2, 1, 4, 3})));
    }
}
