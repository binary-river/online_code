import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_15894 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long input = Long.parseLong(br.readLine());

//        long upper = input;
//        long sides = input * 2;
//        long bottom = input;
//
//        System.out.println(upper+sides+bottom);

        //simple version
        System.out.println(input *4);

    }
}

