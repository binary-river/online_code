import java.io.*;
import java.util.Arrays;

public class Q_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] a = new int[nm[0]][nm[1]];
        int[][] b = new int[nm[0]][nm[1]];

        //a행렬 저장
        for (int i = 0; i < nm[0]; i++) {
            a[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        //b행렬 저장
        for (int i = 0; i < nm[0]; i++) {
            b[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        //행렬 덧셈
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                bw.write((a[i][j] + b[i][j]) + " ");
            }
            bw.write("\n");
        }

        bw.flush();
    }

}
