package ThisIsCodingTest;

import java.util.Scanner;

public class P_거스름돈 {

    public int solution(int change){
        int answer = 0;
        int[] coin={500,100,50,10};
        int i=0;

        while(change>0){
            if(change-coin[i]>=0) {
                change = change-coin[i];
                answer++;
            }
            else i++;
        }

        return answer;
    }

    public static void main(String[] args) {
        P_거스름돈 P = new P_거스름돈();
        Scanner sc = new Scanner(System.in);
        int change = sc.nextInt();
        System.out.println(P.solution(change));
    }
}
