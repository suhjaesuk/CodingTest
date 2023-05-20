package Programmers;

public class P_숫자문자열과영단어 {

    private static final String[] words = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
    };

    public int solution(String str) {
        for (int i = 0; i < words.length; i++) {
            str = str.replace(words[i], Integer.toString(i));
        }
        return Integer.parseInt(str);
    }
}
