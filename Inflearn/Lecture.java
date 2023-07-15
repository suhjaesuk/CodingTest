package Inflearn;

public class Lecture implements Comparable<Lecture>{
    public int cost;
    public int deadline;

    public Lecture(int cost, int deadline) {
        this.cost = cost;
        this.deadline = deadline;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.deadline - this.deadline;
    }
}
