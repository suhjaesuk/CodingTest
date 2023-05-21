package Programmers;

public class P_문자열다루기기본 {

    public boolean solution1(String str) {
        if (str.length() != 4 && str.length() != 6) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    public boolean solution2(String str) {
       boolean result = str.matches("[0-9]{4}||[0-9]{6}");
        return result;
    }
}
