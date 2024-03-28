import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] g = {4.0, 3.0, 2.0, 1.0, 0.0, 0.0};

        int n = 20;
        double credits = 0.0;
        double grades = 0.0;
        while (n-- > 0) {
            String[] s = br.readLine().split(" ");
            if( s[2].charAt(0) == 'P' ) continue;

            double credit = Double.parseDouble(s[1]);
            double grade = 0.0;
            grade = g[s[2].charAt(0) - 'A'];
            if( s[2].charAt(0) != 'F' && s[2].charAt(1) == '+') grade += 0.5;
            credits += credit;
            grades += credit * grade;
        }

        System.out.println(grades / credits);
    }
}
