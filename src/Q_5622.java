import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int t = 3; //반복횟수
        int n = 2; //다이얼 번호

        //문자 : 다이얼 맵핑
        int[] nums = new int[('Z'-'A')+1];
        for (int i = 'A'; i <= 'Z'; i++) {
            if( t==0 ) {
                t = (i == 'P' || i == 'W') ? 4 : 3;
                n++;
            }

            nums[(i-'A')] = n;
            t--;
        }

        //시간계산
        int time = 0;
        for (int i = 0; i < s.length(); i++) {
            time += nums[(s.charAt(i)-'A')] + 1;
        }

        System.out.println(time);

    }
}
