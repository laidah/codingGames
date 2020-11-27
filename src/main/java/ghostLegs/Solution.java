package ghostLegs;
import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
            int W = in.nextInt();
            int H = in.nextInt();
            if (in.hasNextLine()) {
                in.nextLine();
            }

        System.out.println(W + " " + H);

        char[][] arr = new char[W][H];
        for (int i = 0; i < H; i++) {
        String line = in.nextLine();
        for (int j = 0; j < W; j++){
              arr[i][j] = line.charAt(j);
           }
        }
        in.close();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();

        }

        //searching for the answer




    }
}