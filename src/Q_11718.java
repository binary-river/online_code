import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;
        while((s=br.readLine()) != null && !s.equals(""))  {
            sb.append(s + "\n");
        }

        System.out.println(sb.toString());
    }
}
