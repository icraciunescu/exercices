package issues.i043.javaHashSet;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here

        HashSet<String> pairs = new HashSet<>( t );
        for (int i = 0; i < t; i++) {
            pairs.add( pair_left[i] + " " + pair_right[i] );
            System.out.println(pairs.size());
        }

    }

}

/*
https://www.hackerrank.com/challenges/java-hashset/problem?h_r=next-challenge&h_v=zen
 */