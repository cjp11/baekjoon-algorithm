import java.io.*;

public class Ex_2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            //앞 공백 찍기
            for(int j=0; j<n-(i+1); j++) {
                bw.write(" ");
            }
            //별 찍기
            for(int j=0; j<2*i+1; j++) {
                bw.write("*");
            }

            bw.write("\n");
        }

        bw.close();
    }
}
