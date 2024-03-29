import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 9;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int max = 0, maxm= 0, maxn= 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if( matrix[i][j] > max ) {
                    max = matrix[i][j];
                    maxm = i;
                    maxn = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((maxm+1) + " " + (maxn+1));

    }
}
