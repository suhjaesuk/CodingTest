package Inflearn;

public class Friend implements Comparable<Friend>{

    int time;
    char state;
    // 방문 시간: v
    // 떠나는 시간: l

    public Friend(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Friend o) {
        if (this.time == o.time) {
            return this.state - o.state;
        }
        return this.time - o.time;
    }
}
