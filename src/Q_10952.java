import java.util.Scanner;

public class Q_10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(true){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if( a == 0 && b == 0 ) break;
            sb.append((a+b) + "\n");

        }

        System.out.print(sb.toString());
    }
}
