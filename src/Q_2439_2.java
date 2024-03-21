import java.io.*;
import java.util.Arrays;

public class Q_2439_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] l = new char[n];
        Arrays.fill(l, ' ');

        for (int i = n-1; i >= 0; i--) {
            l[i] = '*';
            bw.append(String.valueOf(l) + "\n");
        }

        bw.flush();
    }
}
