import java.util.Scanner;

public class Q_14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringX = scanner.nextLine();
        String stringY = scanner.nextLine();

        int x = Integer.parseInt(stringX);
        int y = Integer.parseInt(stringY);
        int r = 0;
        if( x > 0 && y > 0 ) r = 1;
        else if ( x > 0 && y < 0 ) r = 4;
        else if ( x < 0 && y > 0 ) r = 2;
        else if ( x < 0 && y < 0 ) r = 3;

        System.out.println(r);
    }
}
