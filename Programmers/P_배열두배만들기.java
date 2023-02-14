package Programmers;

import java.util.ArrayList;
import java.util.List;

public class P_배열두배만들기 {
    public int[] solution(int[] numbers) {
        int[] answer = doubledArray(numbers);
        return answer;
    }

    public int[] doubledArray(int[] numbers){
        List<Integer> arrList = new ArrayList <>();

        for(int i=0; i<numbers.length; i++){
            arrList.add(numbers[i]*2);
        }

        return arrList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

