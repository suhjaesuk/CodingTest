package Programmers;

import java.util.ArrayList;
import java.util.List;

public class P_문자열압축 {

    private int compress(String source, int length) {
        StringBuilder stringBuilder = new StringBuilder();
        String last = "";
        int count = 0;
        for (String token : split(source, length)) {
            if (token.equals(last)) {
                count++;
            } else {
                if (count > 1) {
                    stringBuilder.append(count);
                }
                stringBuilder.append(last);
                last = token;
                count = 1;
            }

            if (count > 1) {
                stringBuilder.append(count);
            }
            stringBuilder.append(last);
        }

        return stringBuilder.length();
    }

    private List<String> split(String source, int length) {
        List<String> tokens = new ArrayList<>();
        for (int startIndex = 0; startIndex < source.length(); startIndex += length) {
            int endIndex = startIndex + length;
            if (endIndex > source.length()) {
                endIndex = source.length();
            }

            tokens.add(source.substring(startIndex, endIndex));
        }
        return tokens;
    }

    public int solution(String s) {
        int min = Integer.MAX_VALUE;
        for (int length = 1; length <= s.length(); length++) {
            int compressed = compress(s, length);
            if (compressed < min) {
                min = compressed;
            }
        }
        return min;
    }
}
