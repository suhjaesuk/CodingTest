package test;

import java.util.HashMap;
import java.util.Map;

public class P_신대륙_발견 {
    public String solution(int month, int day) {
        Map<Integer, Integer> map = new HashMap();
        int[] monthly_day = {0,31,28,31,30,31,30,31,31,30,31,30}; //월 별로 존재하는 일의 개수 / 이 부분을 0,31,59..,304,334 로 초기화 한 뒤 맵 value에 값을 넣을 수 있다.
        int total_monthly_day =0; //해당 월 전까지의 합을 넣을 변수 -> 1월: 0 , 2월: 31, 3월: 59... 12월:334

        //맵의 key에 월 value에 해당 월 전까지의 날짜의 합 넣기 //1 -> 0 2-> 31 3-> 59 ....
        for(int i=1; i<=12; i++){
            total_monthly_day += monthly_day[i-1];
            map.put(i,total_monthly_day);
        }

        //종료 전체 일 수 계산하기
        int total_end_day=map.get(month)+day+98;

        //조건: 365일이 넘으면 다시 1월로 가기
        if(total_end_day>365){
            total_end_day-=365;
        }

        //종료 월, 일 구하기
        int end_month=0;
        int end_day=0;

        for(int i=1; i<=12; i++){
            if(total_end_day-map.get(i)>0){
                end_month++;
                end_day=total_end_day-map.get(i);
            }
        }

        return ""+end_month+"월 "+ end_day + "일" ;
    }

    public static void main(String[] args) {
        P_신대륙_발견 method = new P_신대륙_발견();
        System.out.println(method.solution(11, 27));
    }
}