import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_24265 {
    public static void main(String[] args) throws IOException {

        /**
         * nested for loop
         * 1 to n-1
         * i+1 to n  ==> i to n-1
         *
         * n-1 n-2 n-3 ... 1
         * n*(n-1)/2
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long l = Integer.parseInt(br.readLine());

        System.out.println( (l*(l-1))/2 );
        System.out.println(2);
    }
}
