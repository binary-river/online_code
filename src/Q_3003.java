import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] pieces = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] ra = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < ra.length; i++) {
            sb.append((ra[i] - pieces[i]) + " ");
        }

        System.out.println(sb.toString().trim());
    }
}
