import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char p = '1';
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) p = '0';
        }
        System.out.println(p);
    }
}
