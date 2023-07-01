package Inflearn;

public class P_03_03 {

    public int solution(int[] sales, int consecutiveDays) {
        int sum = 0;
        for (int i = 0; i < consecutiveDays; i++) {
            sum += sales[i];
        }
        int highestSale = sum;
        for (int i = consecutiveDays; i < sales.length; i++) {
            sum = sum + sales[i] - sales[i - consecutiveDays];
            if (highestSale < sum) {
                highestSale = sum;
            }
        }
        return highestSale;
    }
}
