package issues01.i062.java1DArray;

import java.util.Scanner;

public class Java1DArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int i) {
        // Base Cases
        if (i >= game.length) {
            return true;
        } else if (i < 0 || game[i] == 1) {
            return false;
        }

        game[i] = 1; // marks as visited

        // Recursive Cases
        return isSolvable(leap, game, i + leap) ||
                isSolvable(leap, game, i + 1) ||
                isSolvable(leap, game, i - 1);
    }

}


/*
https://www.hackerrank.com/challenges/java-1d-array/problem
 */

//    boolean win = true;
//        if (game[0] == 0) {
//                int sum = 0;
//                int mySum = 0;
//                for (int i = 0; i < game.length; i++) {
//        mySum = sum;
//        sum = sum + game[i];
//        if (mySum == sum) {
//        sum = 0;
//        if (i - leap > 0 && game[i - leap] == 1) {
//        if (game[(i - 1) - leap] != 0) {
//        win = false;
//        break;
//        }
//        }
//        }
//        }
//        if (mySum > leap - 1) {
//        win = false;
//        }
//        }
//        return win;