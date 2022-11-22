package BaekJoon;

import java.io.IOException;
import java.util.Scanner;

public class P10985_구간합 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] S = new int[N]; //합 배열 저장
        int[] Q = new int[M]; //나머지 인덱스 배열 저장
        int answer = 0;

        S[0]=sc.nextInt(); //합배열 만들기
        for(int i=1; i<N; i++){
            S[i]=S[i-1]+sc.nextInt();
        }

        for(int i=0; i<N; i++) {
            int D = S[i]%M; //합 배열 나머지 구하기
            if(D==0) answer++; //나머지가 0이면 answer++
            Q[D]++; //배열 인덱스도 ++
        }

        for(int i=0; i<M; i++) {
            if (Q[i]>1) { //배열 인덱스가 1보다 크면
                answer+=Q[i]*(Q[i]-1)/2;
            }
        }
        System.out.println(answer);
    }
}
