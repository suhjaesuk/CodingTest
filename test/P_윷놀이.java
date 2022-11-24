package test; 
//윷놀이 문제
//등이면 1 배면 0 이 담긴 배열이 있습니다.
//int[] arr1 = {0,1,0,0};
//해당 배열을 가지고 "도, 개, 걸, 윷, 모"를 반환하는 문제입니다.
public class P_윷놀이 {
        public String solution(int[] arr1) {
            String answer = "";
            //배열의 요소가 1(등)이라면 count에 증가연산자를 사용 count++
            int count=0;
            for(int i=0; i<4; i++){
                if(arr1[i]==1){
                    count++;
                }
            }

            //조건을 등이 나온 개수만큼 나누었습니다.
            if(count==0){
                answer="모";
            }
            if(count==1){
                answer="걸";
            }
            if(count==2){
                answer="개";
            }
            if(count==3){
                answer="도";
            }
            if(count==4){
                answer="윷";
            }
            return answer;
        }

        public static void main(String[] args) {
            P_윷놀이 method = new P_윷놀이();
            int[] arr1 = {0,1,0,0};
            System.out.println(method.solution(arr1));
        }
    }

