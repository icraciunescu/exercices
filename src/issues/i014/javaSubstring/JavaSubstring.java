package issues.i014.javaSubstring;

import java.util.Scanner;

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        System.out.println(S.substring( start, end ));

    }

}

/*
https://www.hackerrank.com/challenges/java-substring/problem?h_r=next-challenge&h_v=zen
 */
