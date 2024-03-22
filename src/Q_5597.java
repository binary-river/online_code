import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_5597 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] students = new char[30];
        for (int i = 0; i < 28; i++) {
            int t = Integer.parseInt(br.readLine());
            students[t-1] = 'Y';
        }

        for (int i = 0; i < students.length; i++) {
            if( students[i] != 'Y') System.out.println(i+1);
        }
    }

}
