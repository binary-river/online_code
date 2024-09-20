import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q_5073 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        String r;
        Set<Integer> set = new HashSet<>();
        while( (line = br.readLine()) != null ) {
            if( line.equals("0 0 0")) break;

            int[] adjs = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

            int max = Arrays.stream(adjs).max().getAsInt();
            int sum = Arrays.stream(adjs).sum();

            set.clear();
            set.add(adjs[0]);
            set.add(adjs[1]);
            set.add(adjs[2]);

            if( sum - max <= max ){
                r = "Invalid";
            } else if ( set.size() == 1 ) {
                r = "Equilateral";
            } else if ( set.size() == 2 ) {
                r = "Isosceles";
            } else {
                r = "Scalene";
            }

            System.out.println(r);

        }


    }
}
