package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class P_01_04 {

        public ArrayList<String> solution (int n, String[] str) {
            ArrayList<String> answer = new ArrayList<>();
            for(String s:str){
                String temp = new StringBuilder(s).reverse().toString();
                answer.add(temp);
            }
            return answer;
        }


        public static void main(String[] args) {
            P_01_04 T = new P_01_04();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String[] str = new String[n];
            for(int i=0; i<n; i++){
                str[i]=sc.next();
            }
            for (String s : T.solution(n,str)){
                System.out.println(s);
            }
        }
    }


