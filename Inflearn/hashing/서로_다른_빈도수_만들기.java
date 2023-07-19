package Inflearn.hashing;

import java.util.*;
class 서로_다른_빈도수_만들기 {
    public int solution(String s){
        int answer = 0;
        HashMap<Character, Integer> alphabetCounter = new HashMap<>();
        HashSet<Integer> checkValue = new HashSet<>();
        for(char c : s.toCharArray()){
            alphabetCounter.put(c, alphabetCounter.getOrDefault(c, 0) + 1);
        }

        for(char key : alphabetCounter.keySet()){
            while(checkValue.contains(alphabetCounter.get(key))){
                answer++;
                alphabetCounter.put(key, alphabetCounter.get(key) - 1);
            }

            // 0이면 문자가 없어진다.
            if(alphabetCounter.get(key) == 0) {
                continue;
            }

            checkValue.add(alphabetCounter.get(key));
        }
        return answer;
    }

    public static void main(String[] args){
        서로_다른_빈도수_만들기 T = new 서로_다른_빈도수_만들기();
        System.out.println(T.solution("aaabbbcc"));
        System.out.println(T.solution("aaabbc"));
        System.out.println(T.solution("aebbbbc"));
        System.out.println(T.solution("aaabbbcccde"));
        System.out.println(T.solution("aaabbbcccdddeeeeeff"));
    }
}
