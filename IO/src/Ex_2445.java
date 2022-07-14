import java.io.*;

public class Ex_2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            // sol. 별 공백 공백 별 순서로 찍기
            for(int j=0; j<i+1; j++) {
                bw.write("*");
            }
            for(int j=0; j<n-(i+1); j++) {
                bw.write(" ");
            }
            for(int j=0; j<n-(i+1); j++) {
                bw.write(" ");
            }
            for(int j=0; j<i+1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-(1+i); j++) {
                bw.write("*");
            }
            for(int j=0; j<(i+1); j++) {
                bw.write(" ");
            }
            for(int j=0; j<(i+1); j++) {
                bw.write(" ");
            }
            for(int j=0; j<n-(1+i); j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
