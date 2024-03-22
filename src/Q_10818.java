import java.util.Scanner;

public class Q_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String l = scanner.nextLine();
        String[] s = l.split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length; i++) {
            int t = Integer.parseInt(s[i]);
            if ( t < min ) min = t;
            if ( t > max ) max = t;
        }

        System.out.println(min + " " + max);
    }
}
