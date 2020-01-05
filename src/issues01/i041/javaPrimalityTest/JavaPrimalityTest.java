package issues01.i041.javaPrimalityTest;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

    private static final Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {

        BigInteger n = scanner.nextBigInteger();
        scanner.close();

        int certainly = 100;

        System.out.println(n.isProbablePrime( certainly ) ?  "prime" : "not prime");

    }

}

/*
https://www.hackerrank.com/challenges/java-primality-test/problem?h_r=next-challenge&h_v=zen
 */


