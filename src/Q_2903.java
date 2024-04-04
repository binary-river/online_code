import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2903 {
    public static void main(String[] args) throws IOException {
/*
      1  2*2
      2  3*3
      4  (3+2)*5
      8  (5+4)*9
     16  (9+8)*(9+8)
     푸는 중..
 */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int dot = 4;
        int e = 3;
        for (int i = 1; i <= n; i++) {
            dot = dot + (2 * i + 1) * (int) Math.pow(2.0, i) - (int)Math.pow(4, i - 1);
        }

        System.out.println(dot);
    }
}
