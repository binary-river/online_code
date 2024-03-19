import java.util.Scanner;

public class Q_2588 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int a = Integer.parseInt(s1);
        for (int i = s2.length()-1; i >= 0; i--) {
            int t = a * (s2.charAt(i) - '0');
            System.out.println(t);
        }
        System.out.println(a * Integer.parseInt(s2));

    }
}
