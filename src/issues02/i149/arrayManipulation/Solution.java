package issues02.i149.arrayManipulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long result = Long.MIN_VALUE;
        long[] arr = new long[n];
        long sum = 0;

        for (int i = 0; i < queries.length; i++) {
            int k = queries[i][2];
            int b = queries[i][1];
            int a = queries[i][0];
            arr[a - 1] = arr[a - 1] + k;
            if (b < n) {
                arr[b] = arr[b] - k;
            }
//            while (a <= b) {
//                arr[a - 1] = arr[a - 1] + k;
//                result = Math.max(arr[a - 1], result);
//                a++;
//            }
        }
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            result = Math.max(result, sum);
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\JavaTest\\Exercises\\src\\issues02\\i149\\arrayManipulation\\file.txt"));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


/*
https://www.hackerrank.com/challenges/crush/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

10 3
1 5 3
4 8 7
6 9 1
10

10 4
2 6 8
3 5 7
1 8 1
5 9 15
31

 */
