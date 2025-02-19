import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Q_2839 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 3 <= N <= 5000

        // 3x + 5y = N
        int result = 0;
        int x=0;

        while(3*x <= N){
            if ((N - 3 * x) % 5 == 0) {
                result = x + (N - 3 * x) / 5;
                break;
            }
            x++;
        }

        System.out.println(result == 0 ? -1 : result);
    }
}
