package ThisIsCodingTest;

import java.util.Scanner;

public class P_1이될때까지 {

    public int solution(int n, int k){
        int answer = 0;
        while(n>1){
            if(n%k==0) n/=k;
            else n-=1;
            answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        P_1이될때까지 P = new P_1이될때까지();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(P.solution(n,k));
    }
}
