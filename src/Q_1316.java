import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0; //그룹단어 수

        while (n-->0) {
            String s = br.readLine();
            int[] alpha = new int['z'-'a'+1];

            //그룹단어 확인
            int gw = 1; //그룹단어 여부
            for (int i = 0; i < s.length(); i++) {
                char t = s.charAt(i);
                if (alpha[t - 'a'] == 0) {
                    alpha[t - 'a']++;
                } else if ( i != 0 && t != s.charAt(i - 1)) {
                    gw = 0;
                    break;
                }
            }
            cnt += gw;
        }

        System.out.println(cnt);
    }
}
