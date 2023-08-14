import java.io.*;

import static java.lang.Math.min;

public class Ex_2579_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] s = new int[301]; //계단 값
        int[] d = new int[301]; //i번째 계단까지 올라섰을 때 밟지 않을 계단의 합의 최솟값, 단 i번째 계단은 반드시 밟지 않을 계단으로 선택해야함.
        int tot = 0;            //계단의 전체 합
        for(int i=1; i<=n; i++) {
            s[i] = Integer.parseInt(br.readLine());
            tot += s[i];
        }

        d[1] = s[1];
        d[2] = s[2];
        d[3] = s[3];
        for(int i=3; i<=300; i++) {
            d[i] = min(d[i-2], d[i-3]) + s[i];
        }
        bw.write(tot - min(d[n-1], d[n-2]) + "\n"); // n번째는 반드시 올라서야 하므로 n-1 또는 n-2 번째 계단을 올라섰을 때 밟지 않을 계단의 합의 최솟값을 뻰다

        bw.close();
    }
}
