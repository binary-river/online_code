import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q_10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int a = 'a';
        int z = 'z';

        StringBuilder sb = new StringBuilder();
        for (int i = a; i <= z; i++) {
            int t = s.indexOf(i);
            sb.append(t + " ");
        }
        System.out.println(sb.toString());
    }
}
