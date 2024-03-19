import java.util.Scanner;

public class Q_9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int score = Integer.parseInt(line);
        String r = "";

        if( score >= 90 ) r = "A";
        else if ( score >= 80) r = "B";
        else if ( score >= 70) r = "C";
        else if ( score >= 60) r = "D";
        else r = "F";

        System.out.println(r);
    }
}
