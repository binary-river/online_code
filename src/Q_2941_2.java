import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2941_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String r = s.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", ".");
        System.out.println(r.length());
    }
}
