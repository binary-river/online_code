import java.util.Scanner;

public class Q_2439 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //last line
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }

        String lastLine = sb.toString();

        String[] stars = new String[n];
        StringBuilder sb2 = new StringBuilder();
        for (int i = n-1; i >= 0; i--) {
            stars[i] = sb2.toString() + lastLine.substring(n-1-i);
            sb2.append(" ");
        }

        for (String star : stars) {
            System.out.println(star);
        }
    }
}
