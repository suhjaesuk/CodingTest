package Inflearn;

public class Meeting implements Comparable<Meeting>{
    int startTime;
    int endTime;

    public Meeting(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int compareTo(Meeting o) {
        if (this.endTime == o.endTime) {
            return this.startTime - o.startTime;
        }
        return this.endTime - o.endTime;
    }
}
