import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q_3009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> mapX = new HashMap<>();
        Map<Integer, Integer> mapY = new HashMap<>();

        //input
        for (int i = 0; i < 3; i++) {
            String line = br.readLine();
            int[] dot = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

            int xCnt = mapX.getOrDefault(dot[0], 0);
            int yCnt = mapY.getOrDefault(dot[1], 0);

            mapX.put(dot[0], xCnt + 1);
            mapY.put(dot[1], yCnt + 1);
        }


        //find and print
        int missingX = 0;
        for (Integer integer : mapX.keySet()) {
            if( mapX.get(integer) == 1 ) {
                missingX = integer;
                break;
            }
        }

        int missingY = 0;
        for (Integer integer : mapY.keySet()) {
            if( mapY.get(integer) == 1 ) {
                missingY = integer;
                break;
            }
        }

        System.out.println(missingX + " " + missingY );

    }
}
