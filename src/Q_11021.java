import java.util.Scanner;

public class Q_11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            sb.append("Case #" + (i+1) + ": " + (a+b) + "\n");
        }
        System.out.println(sb.toString());
    }
}
