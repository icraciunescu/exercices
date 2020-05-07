package issues02.i122.arrays2D;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        System.out.println(hourglassesMaxVal(arr));
    }

    static int hourglassesMaxVal(int[][] myArray) {
        int nrRows = 6;
        int nrColumns = 6;
        int tempVal;
        int finalVal = Integer.MIN_VALUE;
        for (int a = 0; a < nrRows - 2; a++) {
            for (int b = 0; b < nrColumns - 2; b++) {
                tempVal = myArray[a][b] + myArray[a][b+1] + myArray[a][b+2]
                        + myArray[a+1][b+1]
                        + myArray[a+2][b] + myArray[a+2][b+1] + myArray[a+2][b+2];
                if (tempVal > finalVal) {
                    finalVal = tempVal;
                }
            }
        }

        return finalVal;
    }
}


/*
https://www.hackerrank.com/challenges/30-2d-arrays/problem
 */
