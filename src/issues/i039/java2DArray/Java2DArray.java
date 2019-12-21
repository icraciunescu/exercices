package issues.i039.java2DArray;

import java.util.Scanner;

public class Java2DArray {

    private static final Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {

        int sum = Integer.MIN_VALUE;

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split( " " );
            scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt( arrRowItems[j] );
                arr[i][j] = arrItem;
            }
        }

        scanner.close();


        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                int hourglass = arr[x][y] + arr[x][y+1] + arr[x][y+2]
                        + arr[x+1][y+1]
                        + arr[x+2][y] + arr[x+2][y+1] + arr[x+2][y+2];
                if (sum < hourglass) {
                    sum = hourglass;
                }
            }
        }
        System.out.println( sum );

    }

}

/*
https://www.hackerrank.com/challenges/java-2d-array/problem?h_r=next-challenge&h_v=zen
 */
