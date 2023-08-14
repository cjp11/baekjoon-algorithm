import java.io.*;

import static java.lang.Math.max;

public class Ex_2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());    //계단 수
        int[] s = new int[301];              //계단 값
        int[][] d = new int[301][3];                // 현재까지 j개의 계단을 연속해서 밟고,
                                                    // i번째 계단에 올라섰을 때, 총 점수의 합의 최댓값
                                                    // 단, i번째 계단은 반드시 밟아야함.

        for(int i=1; i<=n; i++) {
            s[i] = Integer.parseInt(br.readLine());
        }
        /**
         * // 틀린 이유: 연속된 3계단 밟으면 안된다는 조건 빠짐.
         *   d[i]: i번재 계단에 올라섰을 때, 총 점수의 합의 최댓값
         *         for(int i=3; i<=n; i++) {
         *             d[i] = max(d[i-1],d[i-2]) + s[i];
         *         }
         */
        //초기값
        d[1][1] = s[1];
        d[1][2] = 0;
        d[2][1] = s[2];
        d[2][2] = s[1] + s[2];

        for(int i=3; i<=300; i++) {
            d[i][1] = max(d[i-2][1], d[i-2][2]) + s[i];
            d[i][2] = d[i-1][1] + s[i];
        }

        bw.write(max(d[n][1], d[n][2]) + "\n");
        bw.close();

    }
}
