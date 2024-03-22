import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_10810_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[] baskets = new int[n];

        for (int i = 0; i < m; i++) {
            String[] t = br.readLine().split(" ");
            int a = Integer.parseInt(t[0]);
            int b = Integer.parseInt(t[1]);
            int c = Integer.parseInt(t[2]);

            for (int j = a-1; j < b; j++) {
                baskets[j] = c;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int basket : baskets) {
            sb.append(basket + " ");
        }

        System.out.println(sb.toString());
    }
}
