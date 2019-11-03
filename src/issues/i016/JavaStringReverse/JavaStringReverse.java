package issues.i016.JavaStringReverse;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        String B = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            B = B + A.charAt( i );
        }
        if (A.equals( B )) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}

/*
https://www.hackerrank.com/challenges/java-string-reverse/problem
 */
