package Programmers;

public class P_시저암호 {

    public static void main(String[] args) {
        P_시저암호 P = new P_시저암호();
        int n = 1;
        String alphabet = "z AVZ q";
        String answer = P.solution(alphabet, 4);
        System.out.println(answer);
    }

    public String solution(String alphabets, int n) {
        //TODO 1 : alphabet을 char 배열로 변환
        char[] alphabetArray = alphabets.toCharArray();

        //TODO 2 : char 배열 각 요소마다 반복한다.
        for (int i = 0; i < alphabetArray.length; i++) {
            //TODO 2-A : 만약 알파벳이 아닐 경우 공백 저장
            if (Character.isAlphabetic(alphabetArray[i])) {

                //TODO 2-B : a ~ z 일 경우
                if ('a' <= alphabetArray[i] && alphabetArray[i] <= 'z') {
                    if (alphabetArray[i] + n <= 'z') {
                        alphabetArray[i] = (char) (alphabetArray[i] + n);
                    } else {
                        alphabetArray[i] = (char) (alphabetArray[i] + n + 'a' - 'z' - 1);
                    }
                }

                //TODO 2-C : A ~ Z 일 경우
                if ('A' <= alphabetArray[i] && alphabetArray[i] <= 'Z') {
                    if (alphabetArray[i] + n <= 'Z') {
                        alphabetArray[i] = (char) (alphabetArray[i] + n);
                    } else {
                        alphabetArray[i] = (char) (alphabetArray[i] + n + 'A' - 'Z' - 1);
                    }
                }
            }
        }

        //TODO 3 : char 배열을 String으로 변환
        StringBuilder sb = new StringBuilder();
        for (char alphabet : alphabetArray) {
            sb.append(alphabet);
        }

        String result = sb.toString();
        return result;
    }
}

