import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2745_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int b = Integer.parseInt(s[1]);
        System.out.println(Integer.parseInt(s[0], b));
    }
}
