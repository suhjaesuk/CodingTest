package Inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class P_06_07 {

    public Point[] solution(int total, Point[] points) {
        Arrays.sort(points);
        return points;
    }
    public static void main(String[] args) {
        P_06_07 P = new P_06_07();
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        Point[] points = new Point[total];
        for (int i = 0; i < total; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points[i] = new Point(x, y);
        }
        Point[] answer = P.solution(total, points);
        for (Point point : answer) {
            System.out.println(point.x + " " + point.y);
        }
    }

    static class Point implements Comparable<Point> {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) {
                return this.y - o.y;
            }else {
                return this.x - o.x;
            }
        }
    }
}
