import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_1085 {

    public static void main(String[] args) throws IOException {

        /*  x, y */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] inputArr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        int x = inputArr[0];
        int y = inputArr[1];
        int w = inputArr[2];
        int h = inputArr[3];

        /*
           upper = h - y;
           leftSide = x;
           rightSide = w-x;
           bottom = y;
         */
        int[] len = {h - y, x, w - x, y};
        int min = Arrays.stream(len).min().getAsInt();
        System.out.println(min);
    }

}
