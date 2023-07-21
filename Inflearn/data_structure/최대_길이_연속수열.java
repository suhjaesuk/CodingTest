package Inflearn.data_structure;

import java.util.*;
class 최대_길이_연속수열 {
    public int solution(int[] nums){
        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int answer = 0;
        int count = 1;
        int before = -1000000001;
        for (int number : set) {
            if (number == before + 1) {
                count++;
            } else {
                count = 1;
            }
            answer = Math.max(answer, count);
            before = number;
        }

        return answer;
    }

    public static void main(String[] args){
        최대_길이_연속수열 T = new 최대_길이_연속수열();
        System.out.println(T.solution(new int[]{8, 1, 9, 3, 10, 2, 4, 0, 2, 3}));
        System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0}));
        System.out.println(T.solution(new int[]{3, 3, 3, 3, 3, 3, 3, 3}));
        System.out.println(T.solution(new int[]{-3, -1, -2, 0, 3, 3, 5, 6, 2, 2, 1, 1}));
        System.out.println(T.solution(new int[]{-5, -3, -1, -4, 3, 3, 5, 6, 2, 2, 1, 1, 7}));
    }
}
