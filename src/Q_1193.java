import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1193 {
    public static void main(String[] args) throws IOException {
        /**
         * 1    1/1    1
         * 2    1/2    2
         * 3    2/1    2
         * 4    3/1    3
         * 5    2/2    3
         * 6    1/3    3
         * 7    1/4    4
         * 8    2/3    4
         * 9    3/2    4
         * 10   4/1    4
         * 11   5/1    5
         * 12   4/2    5
         * 13   3/3    5
         * 14   2/4    5
         * 15   1/5    5
         * ...
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int sum = 0;
        int i = 1;
        while (sum < Integer.MAX_VALUE) {
            if( sum + i >= x ) break;
            sum += i;
            i++;
        }

        int a = (i-(x-sum)+1);
        int b = (x - sum);

        if( i % 2 == 0 ) System.out.println(b + "/" + a);
        else System.out.println(a + "/" + b);

    }
}
