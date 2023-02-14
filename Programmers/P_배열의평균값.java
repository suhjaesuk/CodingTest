package Programmers;

public class P_배열의평균값 {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum=0;

        for (int number : numbers) {
            sum += number;
        }
        answer = sum / (double) numbers.length;
        return answer;
    }
}