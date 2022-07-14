import java.io.*;
import java.util.*;

public class Ex_2558 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(stk.nextToken());

        int result;
        result = a+b;

        bw.write(result + "\n");
        bw.close();
    }
}