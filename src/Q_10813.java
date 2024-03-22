import java.util.Scanner;
import java.util.stream.IntStream;

public class Q_10813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
//        int[] baskets = IntStream.rangeClosed(1,n).toArray();
        int[] baskets = new int[n];
        for (int i = 0; i < n; i++) baskets[i] = i+1;

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            swap(baskets, a-1, b-1);
        }

        StringBuilder sb = new StringBuilder();
        for (int basket : baskets) {
            sb.append(basket + " ");
        }

        System.out.println(sb.toString());

    }

    private static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}
