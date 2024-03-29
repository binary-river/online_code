import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] p = new int[100][100];
        int[] xy;
        int sum = 0;

        //배열에 사각형 입력
        while (n-- > 0) {
            xy = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int i = xy[0]; i < xy[0]+10; i++) {
                for (int j = xy[1]; j <xy[1]+10; j++) {
                    if( p[i][j] == 0 ) sum++;
                    p[i][j] = 1;
                }
            }
        }

        System.out.println(sum);

    }
}
