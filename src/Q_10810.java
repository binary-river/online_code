import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Q_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[] baskets = new int[n];

        for (int i = 0; i < m; i++) {
            int[] t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = t[0]-1; j < t[1]; j++) {
                baskets[j] = t[2];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int basket : baskets) {
            sb.append(basket + " ");
        }

        System.out.println(sb.toString());
    }
}
