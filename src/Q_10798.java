import java.io.*;

public class Q_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = 15;
        int r = 5;
        char[][] words = new char[l][r];

        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                words[j][i] = s.charAt(j);
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < r; j++) {
                if(words[i][j] != 0 ) bw.write(words[i][j]);
            }
        }

        bw.flush();
    }
}
