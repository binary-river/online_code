import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int a = s[0];
        int b = s[1];
        int v = s[2];

        int d = (v - a) / (a - b);
        int r = v - (a - b) * d;

        while(r > 0) {
            d++;
            r-=a;
            if( r <= 0 ) break;
            r+=b;
        }

        System.out.println(d);

    }
}
