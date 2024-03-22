import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q_10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            if( t < x ) sb.append(t + " ");
        }

        System.out.println(sb.toString());

    }
}
