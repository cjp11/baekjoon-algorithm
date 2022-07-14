import java.io.*;

public class Ex_10991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 공백 별(별 내의 공백) 순서로 처리
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-(1+i); j++) {
                bw.write(" ");
            }

            for(int j=0; j<(i+1); j++) {
                if(j==0) bw.write("*");
                else bw.write(" *");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
