import java.io.*;
import java.util.Scanner;

public class Q_10951 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String line = br.readLine();
            if( line == null || line.length()==0 ) break;
            String[] s = line.split(" ");
            bw.write((Integer.parseInt(s[0]) + Integer.parseInt(s[1]))+ "\n" );
        }

        bw.flush();
    }
}
