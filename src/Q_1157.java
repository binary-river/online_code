import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] alpha = new int['z'-'a' + 1];

        //문자 수 배열 저장
        for (int i = 0; i < s.length(); i++) {
            if( 'a' <= s.charAt(i) ) alpha[s.charAt(i) - 'a']++;
            else alpha[s.charAt(i) - 'A']++;
        }

        //최대값 저장
        int max = -1;
        int maxi = -1;
        for (int i = 0; i < alpha.length; i++) {
            if( alpha[i] > max ) {
                max = alpha[i];
                maxi = i;
            }
        }

        //최대값 중복 확인
        for (int i = alpha.length-1; i >=0; i--) {
            if (alpha[i] == max && maxi != i) {
                System.out.println("?");
                return ;
            }
        }

        System.out.println((char)(maxi+'A'));

    }
}
