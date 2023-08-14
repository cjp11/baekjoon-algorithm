import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//연속합
public class Ex_1912 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] d = new int[n];

        StringTokenizer stk = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        d[0] = arr[0];
        for(int i=1; i<n; i++) {
            d[i] = Math.max(d[i-1]+arr[i], arr[i]);
        }
        /*
        for(int i=0; i<n; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
        */

        //d[i] 중 max 값이 답
        //오름 정렬 후 맨 뒷 값
        Arrays.sort(d);
        //System.out.println("Sorted d[] : " + Arrays.toString(d));
        System.out.println(d[n-1]);

    }
}
