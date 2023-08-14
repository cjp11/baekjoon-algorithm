import java.io.*;

public class Ex_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());    // 테케 수, 테케 수 제한이 왜 없지? i가 워낙 작아서?
        int[] cnt = new int[n];
        int[] d = new int[11];                      //d[i]: i를 1,2,3의 합으로 나타내는 방법의 수

        d[1] = 1;
        d[2] = 2;
        d[3] = 4;

        //테스트 케이스 입력
        for(int i=0; i<n; i++) {
            cnt[i] = Integer.parseInt(br.readLine());
        }

        // 테이블 완성
        for(int i=4; i<11; i++) {
            d[i] = d[i-1] + d[i-2] + d[i-3];
        }

        for(int i=0; i<n; i++) {
            bw.write(d[cnt[i]] + "\n");
        }
        bw.close();
    }
}
