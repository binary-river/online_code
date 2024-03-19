import java.util.Scanner;

public class Q_1000 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String line = scanner.nextLine();
        String[] s = line.split(" ");
        System.out.println(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
    }
}
