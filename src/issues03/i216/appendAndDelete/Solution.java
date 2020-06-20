package issues03.i216.appendAndDelete;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {

        String result = "Yes";
        boolean myResult = true;
        int difference;

        difference = (Math.max(s.length(), t.length()) - Math.min(s.length(), t.length()));

        if (difference > k) {
            myResult = false;
        }

        if (difference % 2 != k % 2 && difference != 0 && !s.startsWith(t)) {
            myResult = false;
        }

        if (s.startsWith(t)) {
            myResult = true;
        }

        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (s.substring(i).length() + t.substring(i).length() > k) {
                    myResult = false;
                }
                break;
            }
        }

        if (!myResult) {
            result = "No";
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\JavaTest\\Exercises\\src\\issues03\\i216\\appendAndDelete\\file.txt"));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}




/*
https://www.hackerrank.com/challenges/append-and-delete/problem
 */
