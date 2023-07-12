package Inflearn;


import java.util.Deque;
import java.util.LinkedList;

public class P_07_09 {
    Node root;

    public int dfs(int level, Node root) {
        if (root.left == null && root.right == null) {
            return level;
        } else {
            return Math.min(dfs(level + 1, root.left), dfs(level + 1, root.right));
        }
    }

    public int bfs(Node root) {
        int level = 0;
        Deque<Node> deque = new LinkedList<>();
        deque.offer(root);
        while(!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                Node now = deque.poll();
                Node left = now.left;
                Node right = now.right;
                if (left == null && right == null) {
                    return level;
                }
                if (left != null) {
                    deque.offer(left);
                }
                if (right != null) {
                    deque.offer(right);
                }
            }
            level++;
        }
        return level;
    }
    public static void main(String[] args) {
        P_07_09 tree = new P_07_09();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.right = new Node(5);
        tree.root.right.right.right = new Node(5);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        int level = 0;
        System.out.println(tree.dfs(level, tree.root));
        System.out.println(tree.bfs(tree.root));
    }
}
