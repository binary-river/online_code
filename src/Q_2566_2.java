import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_2566_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = 9;
        int max = 0, m=0, n=0;

        while (r-- > 0) {
            int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < nums.length; i++) {
                if( nums[i] > max ) {
                    max = nums[i];
                    m = r;
                    n = i;
                }
            }
        }

        System.out.println(max);
        System.out.println((9-m) + " " + (n+1));
    }
}
