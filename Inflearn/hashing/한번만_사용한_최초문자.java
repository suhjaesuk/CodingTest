package Inflearn.hashing;

import java.util.HashMap;

class 한번만_사용한_최초문자 {
    public int solution(String s){
        HashMap<Character, Integer> alphabetCounter = new HashMap<>();
        char[] alphabets = s.toCharArray();

        for (char alphabet : alphabets) {
            alphabetCounter.put(alphabet, alphabetCounter.getOrDefault(alphabet, 0) + 1);
        }

        for (int i = 0; i < alphabets.length; i++) {
            if (alphabetCounter.get(alphabets[i]) == 1) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        한번만_사용한_최초문자 T = new 한번만_사용한_최초문자();
        System.out.println(T.solution("statitsics"));
        System.out.println(T.solution("aabb"));
        System.out.println(T.solution("stringshowtime"));
        System.out.println(T.solution("abcdeabcdfg"));
    }
}