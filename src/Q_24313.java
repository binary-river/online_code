import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_24313 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long[] a = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long c = Long.parseLong(br.readLine());
        long n0 = Long.parseLong(br.readLine());

//        System.out.println("a[0] : " + a[0] + ", a[1] : " + a[1] + ", c : " + c + ", n0 : " + n0);
        int r = 0;

        if( c >= a[0] && a[0]*n0 + a[1] <= c*n0 ) r = 1;

        System.out.println(r);


    }
}
