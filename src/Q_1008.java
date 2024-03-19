import java.util.Scanner;

public class Q_1008 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String line = scanner.nextLine();
        String[] s = line.split(" ");
        System.out.println(Double.parseDouble(s[0]) / Double.parseDouble(s[1]));
    }
}
