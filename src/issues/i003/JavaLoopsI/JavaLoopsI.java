package issues.i003.JavaLoopsI;

import java.util.Scanner;

public class JavaLoopsI {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (2<=N && N<=20) {

            for (int i = 1; i <= 10; i++) {
                System.out.printf( "%d x %d = %d%n", N, i, N * i );
            }
        }
        else {
            System.out.println("number is not between 2 and 20");
        }

    }

}

/*
https://www.hackerrank.com/challenges/java-loops-i/problem
 */