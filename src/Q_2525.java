import java.util.Scanner;

public class Q_2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int t = scanner.nextInt();

        //add expecting time
        m = m+t;

        //reset m
        if( m >= 60 ) {
            h = (m / 60) + h;
            m = m % 60;
        }

        //rest h
        if( h >= 24 ){
            h = h%24;
        }

        System.out.println(h + " " + m);

    }
}
