package issues02.i127.exceptions_StringToInteger;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        displayInt(S);
    }

    public static void displayInt(String s) {
        try {
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }

}


/*
https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem
 */
