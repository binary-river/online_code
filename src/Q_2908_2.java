import java.io.*;

public class Q_2908_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] nums = new int[2];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (s[i].charAt(2) - '0') * 100 + (s[i].charAt(1) - '0') * 10 + (s[i].charAt(0) - '0') * 1;
        }

        System.out.println(nums[0] > nums[1] ? nums[0] : nums[1]);

    }
}
