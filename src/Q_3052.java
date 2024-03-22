import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 10;
        int m = 42;
        int[] modResult = new int[m];
        for (int i = 0; i < n; i++) {
            modResult[Integer.parseInt(br.readLine())%m]++;
        }

        int cnt = 0;
        for (int i = 0; i < m; i++) {
            if(modResult[i] != 0 ) cnt++;
        }

        System.out.println(cnt);
    }
}
