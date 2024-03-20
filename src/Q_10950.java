import java.util.Scanner;

public class Q_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r[] = new int[n];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            r[i] = a+b;
        }

        for (int i : r) {
            System.out.println(i);
        }
    }
}
