package issues02.i143.repeatedString;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long result;
        long a = (n / s.length());
        long b = (n % s.length());
        long c = 0;
        long d = 0;

        if (s.equals("a")) {
            result = n;
        } else {
            char[] test = s.toCharArray();
            for (char c1 : test) {
                if (c1 == 'a') {
                    c = c + 1;
                }
            }
            for (int i = 0; i < b; i++) {
                if (test[i] == 'a') {
                    d++;
                }
            }
            result = a * c + d;
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\JavaTest\\Exercises\\src\\issues02\\i143\\repeatedString\\file.txt"));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


/*
https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
