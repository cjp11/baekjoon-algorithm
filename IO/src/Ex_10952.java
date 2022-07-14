import java.io.*;
import java.util.*;

public class Ex_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk;
        String str;
        int a;
        int b;

        while(true) {
            stk = new StringTokenizer(br.readLine());
            a = Integer.parseInt(stk.nextToken());
            b = Integer.parseInt(stk.nextToken());
            if( (a==0)&&(b==0) ) {
                break;
            }
            bw.write(a+b + "\n");
        }
        bw.close();
    }
}
