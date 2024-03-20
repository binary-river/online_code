import java.util.Scanner;

public class Q_8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int r = (n+1)*(n/2) + (n%2 == 0 ? 0 : n/2+1);
        int r = n++*n/2;
        System.out.println(r);
    }
}