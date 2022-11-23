package test;


import java.util.Arrays;

public class P_소수의_개수와_덧셈 {
    public String solution(String s) {

        //공백 삭제
        String[] s_change = s.split(" ");

        //int배열에 s_change값 넣기
        int[] arr = new int[s_change.length];
        for(int i=0; i<s_change.length; i++){
            arr[i] = Integer.parseInt(s_change[i]);
        }
        //int 배열 정렬
        Arrays.sort(arr);

        //소수인 수의 최대값 찾기
        int max_prime=0;
        for(int i=0; i<=s_change.length-1; i++){
            if(isPrime(arr[i])){
                max_prime=arr[i];
            }
        }
        //소수가 아닌 수의 최소값 찾기
        int min_notPrime=0;
        for(int j=s_change.length-1; j>=0; j--){
            if(!isPrime(arr[j])){
                min_notPrime=arr[j];
            }
        }
        return ""+min_notPrime+" "+max_prime;
    }

    public static void main(String[] args) {
        P_소수의_개수와_덧셈 method = new P_소수의_개수와_덧셈();
        String s = "97 75 88 99 95 92 73";
        System.out.println(method.solution(s));
    }
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

}