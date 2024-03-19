import java.util.Scanner;

public class Q_2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int year = Integer.parseInt(line);
        int leap = 0;

        if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) leap = 1;
        System.out.println(leap);
    }
}
