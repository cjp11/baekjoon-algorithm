import java.io.*;
import java.util.*;

public class Ex_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk;
        String str;
        int a;
        int b;

        while((str = br.readLine()) != null) {
            stk = new StringTokenizer(str);
            a = Integer.parseInt(stk.nextToken());
            b = Integer.parseInt(stk.nextToken());
            bw.write(a+b + "\n");
        }
        bw.close();
    }
}