package ThisIsCodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class P_큰수의법칙 {

    public int solution(int n, int m, int k, int[] nArr){
        int answer = 0;
        int count = 0;
        Arrays.sort(nArr);
        for(int i=0; i<m; i++){
            if(count<k){
                answer += nArr[n-1];
                count ++;
            }else{
                answer += nArr[n-2];
                count = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P_큰수의법칙 P = new P_큰수의법칙();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] nArr = new int[n];
        for(int i=0; i<nArr.length; i++){
            nArr[i]=sc.nextInt();
        }

        System.out.println(P.solution(n,m,k,nArr));
    }
}
