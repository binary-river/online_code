import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long l = Integer.parseInt(br.readLine());

        System.out.println(l*l*l + "\n" + 3);
    }
}
