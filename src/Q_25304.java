import java.util.Scanner;

public class Q_25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int v = scanner.nextInt();
        int r = 0;
        for (int i = 0; i < v; i++) {
            int price = scanner.nextInt();
            int cnt = scanner.nextInt();
            r += price * cnt;
        }

        if( t == r ) System.out.println("Yes");
        else System.out.println("No");
    }
}
