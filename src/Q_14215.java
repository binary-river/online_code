import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_14215 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        System.out.println( input[0]
                          + input[1]
                          + ( input[2] >= input[0]+input[1] ? input[0] + input[1] - 1 : input[2]  )
        );

    }
}
