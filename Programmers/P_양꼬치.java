package Programmers;

public class P_양꼬치 {
    public int solution(int lamb, int drink) {
        int totalPay = 0;

        int lambPrice = lamb * 12000;
        int drinkPrice = drink * 2000;
        int service = 2000 * (lamb/10);

        totalPay = lambPrice + drinkPrice - service;

        return totalPay;
    }
}
