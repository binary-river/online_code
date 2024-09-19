import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_9063 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;
        int[] input;

        for (int i = 0; i < cnt; i++) {
            input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int x = input[0];
            int y = input[1];

            if( minX > x ) minX = x;
            if( maxX < x ) maxX = x;

            if( minY > y ) minY = y;
            if( maxY < y ) maxY = y;
        }

        int square = cnt == 0 ? 0 : (maxX - minX) * ( maxY - minY );
        System.out.println(square);
    }
}
