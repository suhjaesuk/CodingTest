import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P_잘라서배열로저장하기{
    public static void main(String[] args) {

    }
    class Solution {
        public int[] solution(int[] arr, int d) {
            int[] answer = {};
            List<Integer> list = new ArrayList<>();
            Arrays.sort(arr);

            for (int i : arr) {
                if (i % d == 0) {
                    list.add(i);
                    answer = list.stream().mapToInt(u -> u).toArray();
                }
                if (list.isEmpty()) {
                    answer[0] = -1;
                }
            }

            return answer;
        }
    }

}

