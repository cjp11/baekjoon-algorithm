import java.io.*;
import java.util.StringTokenizer;

public class Ex_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(stk.nextToken());
        int y = Integer.parseInt(stk.nextToken());

        int[] months =  {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;    // 일자 합
        int remain = 0; // 일자를 7로 나눈 나머지

        for(int i=1; i<x; i++) {
            sum += months[i];
        }
        remain = (sum + y) % 7;

        if(remain == 1) bw.write("MON");
        else if(remain == 2) bw.write("TUE");
        else if(remain == 3) bw.write("WED");
        else if(remain == 4) bw.write("THU");
        else if(remain == 5) bw.write("FRI");
        else if(remain == 6) bw.write("SAT");
        else bw.write("SUN");

        bw.close();

    }
}
