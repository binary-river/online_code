import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int r = 1;
        int m = 6;
        n = n-1;  //첫 1 감소

        //벌집 1바퀴 6씩 증가
        //1바퀴씩 감소시켜서 포함되는 지점 계산
        while(n > 0 ) {
            r++;
            n = n-m;
            m +=6;
        }

        System.out.println(r);
    }
}
