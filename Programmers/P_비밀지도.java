package Programmers;

public class P_비밀지도 {
    class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];
            String[] strArr1 = new String[n];
            String[] strArr2 = new String[n];

            //arr1 과 arr2 배열 요소들을 String 배열 2진수로 바꾼다.
            for (int i = 0; i < n; i++) {
                strArr1[i] = Integer.toBinaryString(arr1[i]);
                strArr2[i] = Integer.toBinaryString(arr2[i]);
            }


            //길이가 n이 아니라면 앞에 '0'을 붙여준다
            for (int i = 0; i < n; i++) {
                while (strArr1[i].length() < n) {
                    strArr1[i] = "0" + strArr1[i];
                }
                while (strArr2[i].length() < n) {
                    strArr2[i] = "0" + strArr2[i];
                }
            }


            //문자를 공백인지 벽인지 비교하기 위해 split 으로 쪼개기
            String[][] split1 = new String[n][n];
            String[][] split2 = new String[n][n];
            for (int i = 0; i < n; i++) {
                split1[i] = strArr1[i].split("");
                split2[i] = strArr2[i].split("");
            }

            //둘 중 한개의 지도라도 1이면 # 아니면 공백 추가
            for (int i = 0; i < n; i++) {
                answer[i] = "";
                for (int j = 0; j < n; j++) {
                    if (split1[i][j].equals("0") && split2[i][j].equals("0")) {
                        answer[i] = answer[i] + " ";
                    } else {
                        answer[i] = answer[i] + "#";
                    }
                }
            }

            return answer;
        }
    }
}