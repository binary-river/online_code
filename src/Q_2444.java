import java.io.*;

public class Q_2444 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        //증가
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j < i; j++) bw.write(" ");
            for (int j = i; j < i+2*(n-i)-1; j++) bw.write("*");
            bw.write("\n");
        }

        //감소
        for (int i = 1; i <= n-1 ; i++) {
            for (int j = 0; j < i; j++) bw.write(" ");
            for (int j = i; j < i+2*(n-i)-1; j++) bw.write("*");
            bw.write("\n");
        }

        bw.flush();

    }
}
