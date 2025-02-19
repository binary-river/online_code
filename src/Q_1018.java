import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1018 {


    /***
     *
     * 지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다. 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.
     *
     * 체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.
     *
     * 보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다. 당연히 8*8 크기는 아무데서나 골라도 된다. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] r = new int[n][m];


        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                r[i][j] = line[j].equals("W") ? 1:0;
            }
        }


//        for (int i = 0; i < r.length; i++) {
//            for (int j = 0; j < r[0].length; j++) {
//                System.out.print( r[i][j] );
//            }
//            System.out.println();
//        }

//        System.out.println("=========================================");

        int min = 8*8;
        for (int i = 0; i <= r[0].length-8; i++) {
            for (int j = 0; j <= r.length-8; j++) {
                int[][] tempBoard = copyBoard(r, 8, 8, i, j);
                int t = boardCheck(tempBoard);

                if( t < min ) min = t;
            }
        }

        System.out.println(min);
    }

    private static int[][] copyBoard(int[][] board, int x, int y, int pX, int pY) {

        int[][] tempBoard = new int[x][y];

//        System.out.println("board.length : " + board.length + " , pY : " + pY + ", y : " + y);
        if( board[0].length - pX < x ) throw new RuntimeException("out of index, pX");
        if( board.length - pY < y ) throw new RuntimeException("out of index, pY");

        for (int i = 0; i <tempBoard.length; i++) {
            for (int j = 0; j <tempBoard[0].length; j++) {
                tempBoard[i][j] = board[pY+i][pX+j];
            }
        }

//        System.out.println("=============test=============");
//
//        for (int i = 0; i <tempBoard.length; i++) {
//            for (int j = 0; j <tempBoard[0].length; j++) {
//                System.out.print(tempBoard[i][j]);
//            }
//            System.out.println(" ");
//        }
//
//        System.out.println("=============test=============");

        return tempBoard;
    }


    private static int boardCheck(int[][] board){
        /*
        0=>0, 0=>1,
        1=>1, 1=>0
        2=>0  3=>1
        00 01 02 03 04 05 06 07
        10 11 12 13 14 15 16 17 ...
        20 21 22 23 24 25 26 27
        */

        /* odd = 0 */
        int oddDiff = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int rest = (i+j)%2;
                if( rest == 0 && board[i][j] != 1 ) oddDiff++;
                if( rest == 1 && board[i][j] != 0 ) oddDiff++;
            }
        }


        /* even = 0 */
        int evenDiff = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int rest = (i+j)%2;
                if( rest == 0 && board[i][j] != 0 ) evenDiff++;
                if( rest == 1 && board[i][j] != 1 ) evenDiff++;
            }
        }

        return oddDiff < evenDiff ? oddDiff:evenDiff;
    }
}
