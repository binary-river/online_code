import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int b = Integer.parseInt(s[1]);

        int sum = 0;
        int len = s[0].length();
        int pow = 1;

        while (len-- > 0) {
            int t = s[0].charAt(len);
            t = t >= 'A' ? t - 'A' + 10 : t - '0';
            sum += t * pow;
            pow *= b;
        }

        System.out.println(sum);

    }
}
