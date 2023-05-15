package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_DNA비밀번호 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String DNA = stringTokenizer.nextToken();

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] needDNA = new int[4];
        for (int i = 0; i < 4; i ++) {
            needDNA[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        char[] eachDNA = DNA.toCharArray();

        int answer = 0;
        for (int i = 0; i <= n - m; i++) {
            boolean isDNA = true;
            int needA = needDNA[0];
            int needC = needDNA[1];
            int needG = needDNA[2];
            int needT = needDNA[3];
            for (int j = i; j < i + m; j++) {
                if (eachDNA[j] == 'A') {
                    needA--;
                }else if (eachDNA[j] == 'C') {
                    needC--;
                }else if (eachDNA[j] == 'G') {
                    needG--;
                }else if (eachDNA[j] == 'T') {
                    needT --;
                }else {
                    isDNA = false;
                }
            }
            if (isDNA & needA <= 0 & needC <= 0 & needG <= 0 & needT <= 0) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
