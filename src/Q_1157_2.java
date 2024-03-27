import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1157_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] alpha = new int['z'-'a' + 1];

        //문자 수 배열 저장
        for (int i = 0; i < s.length(); i++) {
            if( 'a' <= s.charAt(i) ) alpha[s.charAt(i) - 'a']++;
            else alpha[s.charAt(i) - 'A']++;
        }

        //최대값 확인
        int ans = 0, idx = 0;
        for (int i = 1; i < alpha.length; i++) {
            if (alpha[idx] < alpha[i]) ans = idx = i;
            else if (alpha[idx] == alpha[i]) ans = -2;
        }

        System.out.println((char)(ans+'A'));

    }
}
