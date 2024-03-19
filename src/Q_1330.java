import java.util.Scanner;

public class Q_1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String s[] = line.split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        String r = "";

        if( a > b ) r = ">";
        else if ( a < b ) r = "<";
        else r = "==";

        System.out.println(r);

    }
}
