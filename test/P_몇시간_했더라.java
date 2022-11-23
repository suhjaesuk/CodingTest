package test;

public class P_몇시간_했더라 {
    //2번. 몇시간 했더라? (중)
    //해당 문제는 일주일간 공부를 총 몇시간 했는지 체크인 시간과 체크아웃 시간을 통하여 알아내는 알고리즘입니다.
    //결과는 각 요일의 (체크아웃시간 - 체크인시간)의합
    //단, 체크아웃 시간이 29시 (새벽 5시)가 넘어가면 21시로 변한다는 조건이 있습니다.
    public int solution(int[] checkin, int[] checkout) {
        int answer = 0;
        for(int i=0; i<7; i++){ //일주일은 7개의 요일로 정해져있습니다.
            if(checkout[i]>29){ //조건
                checkout[i]=21;
            }
            answer+=checkout[i]-checkin[i]; //해당요일의 체크아웃과 체크인시간 빼주기
        }
        return answer;
    }

    public static void main(String[] args) {
        P_몇시간_했더라 method = new P_몇시간_했더라();
        int[] checkin = {9, 9, 9, 9, 7, 9, 8};
        int[] checkout = {23, 23, 30, 28, 30, 23, 23};
        //예상 출력값 102
        System.out.println(method.solution(checkin, checkout));
    }
}
