import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] l = br.readLine().split(" ");
        int n = Integer.parseInt(l[0]);
        int m = Integer.parseInt(l[1]);

        int[] baskets = new int[n];
        for (int i = 0; i < baskets.length; i++) baskets[i] = i+1;

        for (int i = 0; i < m; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            swap2(baskets, a-1, b-1);
        }

        StringBuilder sb = new StringBuilder();
        for (int basket : baskets) {
            sb.append(basket + " ");
        }
        System.out.println(sb.toString());
    }

    private static void swap(int[] arr, int start, int end ){
        for (int i = start; i <= start + (end-start)/2; i++) {
            int t = arr[i];
            arr[i] = arr[end - (i - start)];
            arr[end - (i - start)] = t;
        }
    }

    private static void swap2(int[] arr, int start, int end) {
        while(start < end ) {
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }
}
