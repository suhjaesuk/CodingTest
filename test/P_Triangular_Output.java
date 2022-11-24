package test;

public class P_Triangular_Output {
    public void solution(int star) {
        // repeat()을 이용하여 풀었습니다.
        //반복문 1부터 시작
        //처음 공백 = repeat(별의개수 - i)
        //별 = 먼저 별 하나를 더해준뒤 repeat2(i-1)
        //나중 공백 = repeat(별의개수 -i)

        for(int i=1; i<=star;i++){
            String answer= " ".repeat(star-i)+"*"+"*".repeat(2*(i-1))+" ".repeat(star-i);
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        P_Triangular_Output method = new P_Triangular_Output();
        int star = 9;
        method.solution(star);
    }
}
