package Inflearn;

import java.util.Scanner;

public class P_01_10 {
    public int[] solution(String str, char c) {
        int[] answer=new int[str.length()];
        char[] x = str.toCharArray();
        int count = 101;
        for(int i=0; i<str.length(); i++) {
            if( x[i] == c) {
                count=0;
                answer[i]=count;
            }else {
                count++;
                answer[i]=count;
            }
        }
        count=101;
        for(int i=str.length()-1; i>=0; i--) {
            if(x[i]==c) {
                count=0;
            }else {
                count++;
                answer[i]=Math.min(answer[i],count);
            }
        }

        return answer;
    }

    public static void main (String[]args){
        P_01_10 T = new P_01_10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x : T.solution(str, c)) {
            System.out.print(x+" ");
        }
    }
}

