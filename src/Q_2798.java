import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_2798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String line2 = br.readLine();

        StringTokenizer st = new StringTokenizer(line1);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] cards = Arrays.stream(line2.split(" ")).mapToInt(Integer::parseInt).toArray();


        int max = 0;
        boolean g = false;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    int t = cards[i] + cards[j] + cards[k];
                    if( t > max && t <= m ) max = t;

                    if( max == m ) g = true;
                    if(g) break;
                }
                if(g) break;
            }
            if(g) break;
        }

        System.out.println(max);
    }
}
