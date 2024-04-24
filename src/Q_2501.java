import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = s[0];
        int k = s[1];
        int i = 1;
        while( i <= n/2 ) {
            if( n%i == 0 ) k--;
            if( k == 0 ) break;
            i++;
        }

        if( k == 1 ) System.out.println(n);
        else if( k == 0 ) System.out.println(i);
        else System.out.println("0");
    }
}
