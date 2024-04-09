import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2903 {
    public static void main(String[] args) throws IOException {
/*
    n rec
    0 1   : 4
    1 2   : 4  + 1*1*1   + 1*2       + 1*2       = 9
    2 4   : 9  + 1*2*2   + 2*(2+1)   + 2*(2+1)   = 25
    3 8   : 25 + 1*4*4   + 4*(4+1)   + 4*(4+1)   = 81
    4 16  : 81 + 1*8*8   + 8*(8+1)   + 8*(8+1)   = 289
    5 32  : 289+ 1*16*16 + 16*(16+1) + 16*(16+1) = 1089
 */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int dot = 4; //점의 개수
        int rec = 1; //한 변의 사각형 개수

        for (int i = 0; i <n; i++) {
            dot = dot + 1 * rec * rec + rec * (rec + 1) * 2;
            rec *= 2;
        }

        System.out.println(dot);
    }
}
