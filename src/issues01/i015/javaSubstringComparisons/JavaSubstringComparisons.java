package issues01.i015.javaSubstringComparisons;

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring( 0, k );
        String largest = s.substring( 0, k );
        String temp = "";
        if (k < s.length()) {
            for (int i = 0; i < s.length() - k + 1; i++) {
                temp = s.substring( i, i + k );
                if (smallest.compareTo( temp ) > 0) {
                    smallest = temp;
                }
                if (largest.compareTo( temp ) < 0) {
                    largest = temp;
                }
            }
        }
        return smallest + "\n" + largest;
    }

}

/*
https://www.hackerrank.com/challenges/java-string-compare/problem
 */
