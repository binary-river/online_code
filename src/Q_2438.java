import java.util.Scanner;

public class Q_2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("*");
            sb2.append(sb.toString() + "\n");
        }

        System.out.println(sb2.toString());
    }
}
