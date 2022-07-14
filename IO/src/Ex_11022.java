import java.io.*;
import java.util.*;

public class Ex_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk;
        int n = Integer.parseInt(br.readLine());
        int a;
        int b;

        for(int i=0; i<n; i++) {
            stk = new StringTokenizer(br.readLine());
            a = Integer.parseInt(stk.nextToken());
            b = Integer.parseInt(stk.nextToken());
            bw.write("Case #" + (i+1) +": " + a + " + " + b + " = " + (a+b) + "\n");
        }
        bw.close();
    }
}