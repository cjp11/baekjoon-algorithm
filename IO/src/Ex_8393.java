import java.io.*;

public class Ex_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i=0; i<n; i++) {
            sum += (i+1);
        }

        bw.write(sum + "\n");
        bw.close();
    }
}
