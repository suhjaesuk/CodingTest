package Inflearn;

public class Player implements Comparable<Player> {
    public int height;

    public int weight;

    public Player(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Player o) {
        return o.height - this.height;
    }
}
