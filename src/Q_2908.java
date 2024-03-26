import java.io.*;

public class Q_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");

        int maxi = 0;
        for (int i = s[0].length()-1; i >= 0; i--) {
            if(s[0].charAt(i) > s[1].charAt(i) ){
                maxi = 0;
                break;
            } else if(s[0].charAt(i) < s[1].charAt(i) ) {
                maxi = 1;
                break;
            }
        }

        for (int i = s[maxi].length()-1; i >= 0; i--) {
            bw.write(s[maxi].charAt(i));
        }

        bw.flush();

    }
}
