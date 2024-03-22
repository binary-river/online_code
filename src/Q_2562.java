import java.util.Scanner;

public class Q_2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 9;

        int max = 0;
        int maxi = 1;
        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            if( t > max ) {
                max = t;
                maxi = i+1;
            }
        }

        System.out.println(max);
        System.out.println(maxi);
    }
}
