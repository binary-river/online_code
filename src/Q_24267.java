import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_24267 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long sum = 0L, t=0L;

        for (int i = 1; i <= n-2; i++) {
            t = t+i;
            sum = sum+t;
        }

        System.out.println(sum + "\n" + 3);
    }
}
