import java.util.Arrays;
import java.util.Scanner;

public class Q_2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dices[] = { scanner.nextInt(),scanner.nextInt(),scanner.nextInt() };
        int r[] = new int[7];

        for (int i = 0; i < dices.length; i++) {
            r[dices[i]]++;
        }

        int max = 0;
        int dup = 0;
        for (int i = r.length-1; i >= 1; i--) {
            if( r[i] > dup ) {
                dup = r[i];
                max = i;
            } else if( dup <= 1 && r[i] == 1 ){
                max = max < r[i] ? r[i] : max;
            }
        }

        int prize = 0;
        if( dup == 3 ) prize = 10000 + max*1000;
        else if ( dup == 2 ) prize = 1000 + max * 100;
        else prize = max * 100;

        System.out.println(prize);
    }
}
