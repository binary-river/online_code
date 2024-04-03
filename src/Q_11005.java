import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int num = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        StringBuilder sb = new StringBuilder();

        while (num >= b) {
            int r = num % b;
            sb.append(r >= 10 ? (char)(r - 10 + 'A') : r+"");
            num = num / b;
        }

        if( num != 0 ) sb.append(num >= 10 ? (char)(num - 10 + 'A') : num+"");

        System.out.println(sb.reverse().toString());
    }
}
