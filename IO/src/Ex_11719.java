import java.io.*;
import java.util.*;

public class Ex_11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;

        // br.readLine() 은 return 하는 것이므로 String 선언으로 값 할당하여 사용하기.(실수 줄이기)
        while((str = br.readLine()) != null) {
            bw.write(str + "\n");
        }
        bw.close();
    }
}