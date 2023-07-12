package Inflearn;

public class Node {
    Node left;
    Node right;
    int value;

    public Node(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }
}