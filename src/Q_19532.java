import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_19532 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());
        long e = Long.parseLong(st.nextToken());
        long f = Long.parseLong(st.nextToken());

        boolean found = false;
        for (long x = -999L; x <= 999L; x++) {
            for (long y = -999L; y <= 999L; y++) {

                if( a*x + b*y == c && d*x+e*y == f ) {
                    found = true;
                    System.out.println(x + " " +y );
                }

                if (found) break;
            }
            if (found) break;
        }
    }
}

