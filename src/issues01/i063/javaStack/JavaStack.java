package issues01.i063.javaStack;

import java.util.Scanner;

public class JavaStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            while (input.length() != (input = input.replaceAll( "\\(\\)|\\[\\]|\\{\\}", "" )).length()) ;
            System.out.println( input.isEmpty() );
        }

    }

}


/*
https://www.hackerrank.com/challenges/java-stack/problem
 */