import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_10101 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] angles = new int[3];
        for (int i = 0; i < 3; i++) {
            angles[i] = Integer.parseInt(br.readLine());
        }

        String r;
        if ( Arrays.stream(angles).sum() != 180 ) {
            r = "Error";
        } else if( angles[0] == angles[1] && angles[1] == angles[2] ) {
            r = "Equilateral";
        } else if ( angles[0] == angles[1] || angles[1] == angles[2] || angles[0] == angles[2] ) {
            r = "Isosceles";
        } else {
            r = "Scalene";
        }

        System.out.println(r);

    }
}
