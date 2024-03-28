import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q_25206_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> g = new HashMap<>();
        g.put("A+", 4.5);
        g.put("A0", 4.0);
        g.put("B+", 3.5);
        g.put("B0", 3.0);
        g.put("C+", 2.5);
        g.put("C0", 2.0);
        g.put("D+", 1.5);
        g.put("D0", 1.0);
        g.put("F", 0.0);

        int n = 20;
        double points = 0.0;
        double credits = 0.0;
        while (n-- > 0) {
            String[] s = br.readLine().split(" ");
            if( s[2].charAt(0) == 'P') continue;

            double credit = Double.parseDouble(s[1]);
            double grade = g.get(s[2]);

            credits += credit;
            points += credit * grade;
        }

        System.out.println(points/credits);

    }
}
