import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] coins = {25, 10, 5, 1};
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int c = Integer.parseInt(br.readLine());

            for (int i = 0; i < coins.length; i++) {
                sb.append((c/coins[i]) + " ");
                c = c % coins[i];
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
