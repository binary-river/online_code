import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String[] s = br.readLine().split(" ");
            int r = Integer.parseInt(s[0]);
            Arrays.stream(s[1].split("")).forEach(c -> {
                for (int i = 0; i < r; i++) {
                    sb.append(c);
                }
            });

            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
