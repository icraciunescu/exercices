package issues02.i150.staircase;

import java.util.Scanner;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        StringBuffer stair = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stair.append(" ");
        }
        for (int i = 0; i <= n - 1; i++) {
            stair.setCharAt((n - 1) - i, '#');
            System.out.println(stair);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}



/*
https://www.hackerrank.com/challenges/staircase/problem
 */