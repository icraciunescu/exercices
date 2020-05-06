package issues02.i121.binaryNumbers;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        System.out.println(maximumConsecutiveOne(n));
    }

    static int maximumConsecutiveOne(int n) {
        String number = binaryView(n);
        int testNumber = 0;
        int result = 0;
        for (int i = 0; i <= number.length() - 1; i++) {
            int one = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (one == 0) {
                testNumber = 0;
            }
            if (one == 1) {
                testNumber++;
                if (testNumber > result) {
                    result = testNumber;
                }
            }
        }
        return result;
    }

    static String binaryView(int n) {
        StringBuilder reverseResult = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int a = n / 2;
        int b = n % 2;
        if (a == 0 && b == 0) {
            reverseResult.append(b);
        }
        if (a == 0 && b != 0) {
            reverseResult.append(b);
        }
        if (a != 0) {
            reverseResult.append(b);
            while ((a / 2) != 0) {
                b = a % 2;
                reverseResult.append(b);
                a = a / 2;
            }
            if (a != 0) {
                reverseResult.append(1);
            }
        }
        for(int i = reverseResult.length() - 1; i >= 0; i--) {
            result.append(reverseResult.charAt(i));
        }
        return result.toString();
    }
}


/*
https://www.hackerrank.com/challenges/30-binary-numbers/problem
 */
