package Programmers;

public class P_신규아이디추천 {

    public String solution(String newId) {
        newId = newId.toLowerCase();
        newId = newId.replaceAll("[^a-z0-9\\-_.]","");
        newId = newId.replaceAll("\\.+", ".");
        newId = newId.replaceAll("^\\.+|\\.+$", "");
        if (newId.isEmpty()) newId = "a";
        if (newId.length() > 15) {
            newId = newId.substring(0, 15);
            newId = newId.replaceAll("\\.+$", "");
        }
        while (newId.length() < 3) {
            newId += newId.charAt(newId.length() - 1);
        }

        return newId;
    }

}
