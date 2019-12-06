package issues.i019.javaStringTokens;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        String s = scan.nextLine();
        scan.close();
        StringTokenizer st = new StringTokenizer( s, ("[_\\@!?.', ]") );
        int x = st.countTokens();
        System.out.println( x );
        while (st.hasMoreTokens()) {
            System.out.println( st.nextToken() );
        }
    }

}

/*
https://www.hackerrank.com/challenges/java-string-tokens/problem
 */
