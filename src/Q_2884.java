import java.util.Scanner;

public class Q_2884 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] s = line.split(" ");
        int h = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        //reset minutes
        m = m-45;
        if( m < 0 ) {
            h = h - 1;
            m = m + 60;
        }

        //reset hours
        if( h < 0 ) {
            h = 24 + h;
        }

        System.out.println(h + " " + m);
    }
}
