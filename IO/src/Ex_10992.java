import java.io.*;

public class Ex_10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 별 모두 찍는 경우에서 첫번째, 끝번째 사이는 모두 공백처리(끝번째 줄 제외)
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-(1+i); j++) {
                bw.write(" ");
            }
            for(int j=0; j<(2*i)+1; j++) {
                if(j==0 || j==(2*i) || i==(n-1)) bw.write("*");
                else bw.write(" ");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
