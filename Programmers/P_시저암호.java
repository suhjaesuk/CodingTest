package Programmers;

public class P_시저암호 {
    class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] c = s.toCharArray();

        for (int i = 1; i <= n; i++) {
            for(int j=0; j<c.length; j++){
                if(Character.isLowerCase(c[j])) {
                    if(c[j]=='z'){
                        c[j]=96;
                    }
                    c[j]++;
                }if(Character.isUpperCase(c[j])){
                    if(c[j]=='Z'){
                        c[j]=64;
                    }c[j]++;
                }
            }
        }
        answer = String.valueOf(c);
        return answer;
    }
}
}
