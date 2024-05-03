import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;

public class Q_9506 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        while( (n = Integer.parseInt(br.readLine())) != -1 ){
            int[] divisors = getDivisors(n);
            int sum = Arrays.stream(divisors).sum();
            StringBuilder sb = new StringBuilder();

            if( sum != n ){
                System.out.println(n + " is NOT perfect.");
            } else{
                Iterator iter = Arrays.stream(divisors).iterator();

                while(iter.hasNext()){
                    sb.append(iter.next());
                    if(iter.hasNext()) sb.append(" + ");
                }
                System.out.println(n + " = " + sb.toString());
            }
        }
    }

    public static int[] getDivisors(int n) {
        int[] d = new int[n / 2];
        int idx = 0;

        d[idx++] = 1;

        for (int i = 2; i*i <= n; i++) {
            if( n%i != 0 ) continue;

            d[idx++] = i;
            if( n/i != i ) d[idx++] = n / i;
        }

        return Arrays.stream(d).filter(x -> x > 0).sorted().toArray();
    }

}
