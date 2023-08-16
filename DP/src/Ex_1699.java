import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_1699 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] d = new int[n+1];

        d[1] = 1;

        // d[] 채우기
        for(int i=2; i<n+1; i++) {
            int min = 100000;
            for(int j=1; j<=i/2; j++) { // i 나눈 몫까지
                if (j * j == i) {
                    min = 1;
                    break;
                } else {
                    min = Math.min(min, d[j] + d[i - j]);
                }
            }
            d[i] = min;

        }

        // 정답
        System.out.println(d[n]);

    }
}
