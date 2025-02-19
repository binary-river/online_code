import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1436 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // N <= 10,000

        int num = 665;
        int cnt = 0;

        while(true) {
            if( checkNumber(++num) ) cnt++;
            if( cnt == N ) break;
        }

        System.out.println(num);
    }

    static boolean checkNumber(int n) {
        String s = String.valueOf(n);
        return s.contains("666");
    }
}
