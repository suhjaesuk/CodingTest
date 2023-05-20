package Programmers;

public class P_행렬의곱셈 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] arr = new int[arr1.length][arr2[0].length];
        //행렬 곱셈
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
                for (int k = 0; k < arr[i].length; k++) {
                    arr[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        return arr;
    }
}
