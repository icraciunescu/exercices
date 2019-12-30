package issues.i058.javaBitSet;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int setSize = scanner.nextInt();
        int noOps = scanner.nextInt();
        BitSet bs1 = new BitSet( setSize );
        BitSet bs2 = new BitSet( setSize );
        for (int i = 0; i < noOps; i++) {
            String op = scanner.next();
            int s1 = scanner.nextInt();
            int s2 = scanner.nextInt();
            if (op.equals( "AND" ) || op.equals( "OR" ) || op.equals( "XOR" )) {
                if (s1 == 1) {
                    switch (op) {
                        case "AND":
                            bs1.and( bs2 );
                            break;
                        case "OR":
                            bs1.or( bs2 );
                            break;
                        case "XOR":
                            bs1.xor( bs2 );
                            break;
                    }
                } else {
                    switch (op) {
                        case "AND":
                            bs2.and( bs1 );
                            break;
                        case "OR":
                            bs2.or( bs1 );
                            break;
                        case "XOR":
                            bs2.xor( bs1 );
                            break;
                    }
                }
            }
            if (op.equals( "SET" ) || op.equals( "FLIP" )) {
                if (s1 == 1) {
                    switch (op) {
                        case "SET":
                            bs1.set( s2 );
                            break;
                        case "FLIP":
                            bs1.flip( s2 );
                            break;
                    }
                } else {
                    switch (op) {
                        case "SET":
                            bs2.set( s2 );
                            break;
                        case "FLIP":
                            bs2.flip( s2 );
                            break;
                    }
                }
            }
            System.out.println( bs1.cardinality() + " " + bs2.cardinality() );
        }

    }

}

/*
https://www.hackerrank.com/challenges/java-bitset/problem
 */
