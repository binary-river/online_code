import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int minP = 0;
        int sumP = 0;

        for (int i = m; i <= n; i++) {
            if( !isPrime(i) ) continue;
            if( minP == 0 ) minP = i;
            sumP += i;
        }

        if( minP == 0 ) {
            System.out.println("-1");
        } else {
            System.out.println(sumP);
            System.out.println(minP);
        }
    }

    private static boolean isPrime(int n){
        if( n == 1 ) return false;

        for (int i = 2; i*i <= n; i++) {
            if( n % i == 0 ) return false;
        }

        return true;
    }
}
