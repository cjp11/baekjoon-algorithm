import java.io.*;
import java.util.*;

public class Ex_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int len = str.length();

        for(int i=0; i<len; i++) {
            bw.write(str.charAt(i));
            if((i%10) == 9) {
                bw.write("\n");
            }
        }
        bw.close();
    }
}
