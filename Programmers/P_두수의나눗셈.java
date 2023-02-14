package Programmers;

public class P_두수의나눗셈 {
    public int solution(int num1, int num2) {
        int answer = (int) (division(num1,num2)*1000);
        return answer;
    }

    public double division(int num1, int num2){
        return num1/(double) num2;
    }
}
