import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_5086 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int[] s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if( s[0] == 0 && s[1] == 0 ) break;

            if ( s[1] % s[0] == 0 ) {
                System.out.println("factor");
            } else if ( s[0] % s[1] == 0 ) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}
