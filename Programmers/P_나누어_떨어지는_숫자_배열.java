package Programmers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class P_나누어_떨어지는_숫자_배열 {
    class Solution {
        public int[] solution(int[] arr, int d) {
            int[] answer = {};
            List<Integer> list = new ArrayList<>();
            Arrays.sort(arr);

            for(int i:arr){
                if(i%d==0){
                    list.add(i);
                }
            }
            if (list.isEmpty()) {
                list.add(-1);
            }
            answer = list.stream().mapToInt(u -> u).toArray();
            return answer;
        }
    }
}
