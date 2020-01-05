package issues01.i056.javaExceptionHandlingTryCatch;

import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

    public static void main(String[] args) {

        try {
            int x;
            int y;
            Scanner scanner = new Scanner( System.in );
            x = scanner.nextInt();
            y = scanner.nextInt();
            scanner.close();

            divide( x, y );

        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (Exception e) {
            String str = e.getClass().getName();
            System.out.println( str );
        }

    }

    public static void divide(int a, int b) {
        System.out.println( a / b );
    }

}

/*
https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
 */