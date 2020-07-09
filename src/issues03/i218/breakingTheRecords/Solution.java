package issues03.i218.breakingTheRecords;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int[] result = new int[2];
        int hScore = Integer.MIN_VALUE;
        int hCount = -1;
        int lScore = Integer.MAX_VALUE;
        int lCount = -1;

        for (int score : scores) {
            if (hScore < score) {
                hScore = score;
                hCount++;
            }
            if (lScore > score) {
                lScore = score;
                lCount++;
            }
        }

        result[0] = hCount;
        result[1] = lCount;

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\JavaTest\\Exercises\\src\\issues03\\i218\\breakingTheRecords\\file.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}



/*
https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */
