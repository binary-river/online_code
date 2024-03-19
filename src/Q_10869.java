import java.util.Scanner;

public class Q_10869 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String line = scanner.nextLine();
        String[] s = line.split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}

