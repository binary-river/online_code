import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ds = getPrimeList(n);

        if( isPrime(n) ) {
            System.out.println(n);
            return; 
        }

        //개선중..

        boolean c = true;
        while (c) {
            for (int i = 0; i < ds.length; i++) {
                if( n % ds[i] == 0 ) {
                    System.out.println(ds[i]);
                    n = n / ds[i];
                    break;
                }
            }

            for (int i = 0; i < ds.length; i++) {
                if( n == ds[i] || n == 1 ) c = false;
            }
        }

        if( n != 1 ) System.out.println(n);
    }

    private static int[] getPrimeList(int n) {
        int[] arr = new int[n / 2];
        int idx = 0;

        for (int i = 2; i*i <= n; i++) {
            if( !isPrime(i) ) continue;
            arr[idx++] = i;

            int t = n/i;
            if( isPrime(t) ) arr[idx++] = t;
        }

        return Arrays.stream(arr).filter(x -> x > 0).sorted().toArray();
    }

    private static boolean isPrime(int n){
        if( n == 1 ) return false;

        for (int i = 2; i*i <= n; i++) {
            if( n % i == 0 ) return false;
        }

        return true;
    }
}
