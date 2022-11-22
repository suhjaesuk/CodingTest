package Programmers;

public class P_신규_아이디_추천 {
    class Solution {
        public String solution(String new_id) {
            String answer = "";
            //조건 1
            String change_id = new_id.toLowerCase();
            //조건 2
            change_id = change_id.replaceAll("[^a-z0-9\\-_.]", "");
            //조건 3 .중복시 제거
            change_id = change_id.replaceAll("[.]{2,}", ".");
            //조건 4 처음과 마지막 .제거
            change_id = change_id.replaceAll("^[.]|[.]$", "");
            //조건 5 빈 문자열이라면 a 로 치환
            if (change_id.equals("")) {
                change_id += "a";
            }

            //조건 6 16자 이상이라면 15개로 짜른 후 처음과 마지막에 .이 있으면 제거
            if (change_id.length() > 15) {
                change_id = change_id.substring(0, 15);
                change_id = change_id.replaceAll("^[.]|[.]$", "");
            }

            //조건 7 2자 이하라면 마지막문자를 3자가 될때까지 복사.
            if (change_id.length() < 3) {
                while (change_id.length() < 3) {
                    String sub = change_id.substring(change_id.length() - 1, change_id.length());
                    change_id += sub;
                }
            }
            answer = change_id;
            return answer;
        }
    }
}