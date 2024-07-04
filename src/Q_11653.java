import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_11653 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 2; i*i <= n; i++) {
            if(!isPrime(i)) continue;

            while( n%i == 0 ) {
                System.out.println(i);
                n = n/i;
            }
        }

        if( n != 1 ) System.out.println(n);
    }

    private static boolean isPrime(int n){
        if( n == 1 ) return false;
        for (int i = 2; i*i <= n ; i++) {
            if( n%i == 0 ) return false;
        }

        return true;
    }
}