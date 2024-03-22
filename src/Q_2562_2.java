import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2562_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 9;

        int max = 0;
        int maxi = 1;
        for (int i = 0; i < n; i++) {
            int t = Integer.valueOf(br.readLine());
            if( t > max ) {
                max = t;
                maxi = i+1;
            }
        }

        System.out.println(max);
        System.out.println(maxi);
    }
}
