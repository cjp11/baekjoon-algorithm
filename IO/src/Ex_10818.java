import java.io.*;
import java.util.StringTokenizer;

public class Ex_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int temp = 0;
        int max = -1000000;
        int min = 1000000;


        for(int i=0; i<n; i++) {
            temp = Integer.parseInt(stk.nextToken());
            if(temp < min) {
                min = temp;
            }
            if(temp > max) {
                max = temp;
            }
        }

        bw.write(min + " " + max + "\n");
        bw.close();
    }
}
