package ThisIsCodingTest;

import java.util.HashMap;
import java.util.List;
//import java.util.Objects;
//import java.util.Scanner;
//
//public class P_상하좌우 {
//
//    public int[] solution(int length, String[] directions){
//        int[] answer = {1,1};
//
//        for(int i=0; i<directions.length; i++){
//            if (Objects.equals(directions[i], "R")) {
//                answer[1]++;
//                cannotExceedMaximumLength(answer,length);
//            }
//            if (Objects.equals(directions[i], "D")) {
//                answer[0]++;
//                cannotExceedMaximumLength(answer,length);
//            }
//            if (Objects.equals(directions[i], "L")) {
//                answer[1]--;
//                cannotExceedMinimumLength(answer);
//            }
//            if (Objects.equals(directions[i], "U")) {
//                answer[0]--;
//                cannotExceedMinimumLength(answer);
//            }
//        }
//        return answer;
//    }
//
//    public void cannotExceedMinimumLength(int[] answer){
//        if(answer[0]<1){
//            answer[0]++;
//        }else if(answer[1]<1){
//            answer[1]++;
//        }
//    }
//
//    public void cannotExceedMaximumLength(int[] answer, int length){
//        if(answer[0]>length){
//            answer[0]--;
//        }else if(answer[1]>length){
//            answer[1]--;
//        }
//    }
//
//    public static void main(String[] args) {
//        P_상하좌우 P = new P_상하좌우();
//        Scanner sc = new Scanner(System.in);
//        int length = sc.nextInt();
//        String[] directions = new String[6];
//        for(int i =0; i< directions.length; i++){
//            directions[i]=sc.next();
//        }
//
//
//        for(int x : P.solution(length, directions)){
//            System.out.print(x+" ");
//        }
//    }
//}

import java.util.Objects;
import java.util.Scanner;

public class P_상하좌우 {

    private static final String RIGHT = "R";
    private static final String DOWN = "D";
    private static final String LEFT = "L";
    private static final String UP = "U";

    public int[] solution(int length, String[] directions) {
        int[] location = {1, 1};

        for (String direction : directions) {
            switch (direction) {
                case RIGHT:
                    location[1]++;
                    adjustIfOutOfBounds(location, length);
                    break;
                case DOWN:
                    location[0]++;
                    adjustIfOutOfBounds(location, length);
                    break;
                case LEFT:
                    location[1]--;
                    adjustIfOutOfBounds(location, length);
                    break;
                case UP:
                    location[0]--;
                    adjustIfOutOfBounds(location, length);
                    break;
            }
        }
        return location;
    }

    public void adjustIfOutOfBounds(int[] location, int length) {
        if (location[0] < 1) {
            location[0]++;
        } else if (location[1] < 1) {
            location[1]++;
        } else if (location[0] > length) {
            location[0]--;
        } else if (location[1] > length) {
            location[1]--;
        }
    }

    public static void main(String[] args) {
        P_상하좌우 p = new P_상하좌우();
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String[] directions = new String[6];
        for (int i = 0; i < directions.length; i++) {
            directions[i] = sc.next();
        }

        StringBuilder sb = new StringBuilder();
        for (int x : p.solution(length, directions)) {
            sb.append(x).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}