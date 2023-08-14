import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Math.min;

public class Ex_1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk;

        int n = Integer.parseInt(br.readLine());
        int[][] rgb = new int[n+1][3];
        int[][] d = new int[n+1][3];

        for(int i=1; i<=n; i++) {
            stk = new StringTokenizer(br.readLine());
            rgb[i][0] = Integer.parseInt(stk.nextToken());
            rgb[i][1] = Integer.parseInt(stk.nextToken());
            rgb[i][2] = Integer.parseInt(stk.nextToken());
        }

        d[1][0] = rgb[1][0];
        d[1][1] = rgb[1][1];
        d[1][2] = rgb[1][2];

        for(int i=2; i<=n; i++) {
            d[i][0] = min(d[i-1][1],d[i-1][2]) + rgb[i][0]; //i번째 집까지 칠할 때, 비용의 최소값. 단, i번째 집은 빨강
            d[i][1] = min(d[i-1][0],d[i-1][2]) + rgb[i][1]; //i번째 집까지 칠할 때, 비용의 최소값. 단, i번째 집은 초록
            d[i][2] = min(d[i-1][0],d[i-1][1]) + rgb[i][2]; //i번째 집까지 칠할 때, 비용의 최소값. 단, i번째 집은 파랑
        }

        bw.write(min(min(d[n][0],d[n][1]),d[n][2]) + "\n");
        bw.close();

    }
}
