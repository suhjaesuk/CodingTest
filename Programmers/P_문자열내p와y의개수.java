package Programmers;

public class P_문자열내p와y의개수 {

    public static boolean solution(String str) {
        String lowerStr = str.toLowerCase();
        int yCount = 0;
        int pCount = 0;
        for(char alphabet : lowerStr.toCharArray()) {
            switch (alphabet) {
                case 'y' -> yCount++;
                case 'p' -> pCount++;
            }
        }

        boolean result = (yCount == pCount);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("hddh"));
    }
}
