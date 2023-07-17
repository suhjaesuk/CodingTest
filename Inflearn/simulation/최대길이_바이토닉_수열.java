package Inflearn.simulation;

import java.util.*;
class 최대길이_바이토닉_수열 {
    public int solution(int[] nums){
        int answer = 0;
        int size = nums.length;
        ArrayList<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < size - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                peaks.add(i);
            }
        }
        for (int x : peaks) {
            int left = x;
            int right = x;
            int count = 1;
            while (left - 1 >= 0 && nums[left - 1] < nums[left]) {
                left--;
                count++;
            }
            while (right + 1 < size && nums[right] > nums[right + 1]) {
                right++;
                count++;
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }

    public static void main(String[] args){
        최대길이_바이토닉_수열 T = new 최대길이_바이토닉_수열();
        System.out.println(T.solution(new int[]{1, 2, 1, 2, 3, 2, 1}));
        System.out.println(T.solution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
        System.out.println(T.solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
        System.out.println(T.solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
    }
}
