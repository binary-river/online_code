import java.util.Scanner;

public class Q_11382 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String s[] = line.split(" ");
        long r = 0;
        for (int i = 0; i < s.length; i++) {
            r += Long.parseLong(s[i]);
        }
        System.out.println(r);
    }
}
