package ThisIsCodingTest;

import java.util.Scanner;

public class P_시각 {

    public int solution(int hours){
        int answer = 0;

        for(int hour = 0; hour <= hours; hour++ ){
            for(int seconds = 0; seconds < 3600; seconds++){
                int minute = seconds/60;
                int second = seconds%60;
                String time = ""+hour+":"+minute+":"+second;

                if(time.contains("3")) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        P_시각 P = new P_시각();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(P.solution(n));
    }
}
