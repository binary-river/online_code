import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2231 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min = n - String.valueOf(n-1).length()*9;

        int t = 0;
        int m = 0;
        for (int i = min; i <= n; i++) {
            t = getDivSum(i);

            if( t == n ) {
                m = i;
                break;
            }
        }

        System.out.println(m);
    }


    private static int getDivSum(int m) {
        int s = m;
        while(m > 0 ) {
            s += m%10;
            m = m/10;
        }

        return s;
    }

}
