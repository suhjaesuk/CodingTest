package Programmers;

public class P_연속된수의합 {
        public int[] solution(int num, int total) {
            int[] answer = new int[num];
            int n=total/num;
            int m=num/2;
            int start_num=0;

            if(num%2==0) start_num=n-m+1;
            else start_num =n-m;

            for(int i=0; i<num; i++) {
                answer[i] = start_num;
                start_num++;
            }
            return answer;
        }
    }

