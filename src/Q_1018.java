import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1018 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[][] board = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String l = br.readLine();
            for (int j = 0; j < l.length(); j++) {
                if( l.charAt(j) == 'B' ) board[i][j] = false;
                else board[i][j] = true;
            }
        }

        int[] cnt = new int[2];
        for (int i = 0; i < cnt.length; i++) {
            for (int j = 0; j <= n-8; j++) {
                for (int k = 0; k <= m-8; k++) {
                    if( j == 0 && k == 0 ) {
                        if( i == 0 ) {
                            continue;
                        }  else {
                            board[j][k] = !board[j][k];
                            cnt[i]++;
                        }
                    } else if( k == 0 ) {
                        if( board[j-1][k] == board[j][k] ){
                            board[j][k] = !board[j][k];
                            cnt[i]++;
                        }
                    } else {
                        if( board[j][k-1] == board[j][k]) {
                            board[j][k] = !board[j][k];
                            cnt[i]++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt[0]);
        System.out.println(cnt[1]);
    }
}
