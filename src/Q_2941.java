import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            cnt++;

            //유형별 글자수 감산
            if( t == '-' ) cnt--;
            else if ( t == '=' && i >= 2 && (s.charAt(i-2) == 'd' && s.charAt(i-1) == 'z' )  ) cnt -= 2;
            else if ( t == '=' ) cnt--;
            else if ( t == 'j' && i >= 1 && (s.charAt(i-1) == 'l' || s.charAt(i-1) == 'n')) cnt--;
        }

        System.out.println(cnt);

    }
}
