package issues.i045.javaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        ArrayList[] myList = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            myList[i] = new ArrayList(  );
            for (int j = 0; j < d; j++) {
                myList[i].add( scanner.nextInt() );
            }
        }

        int q = scanner.nextInt();
        for (int k = 0; k < q; k++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try {
                System.out.println(myList[x - 1].get( y - 1 ));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

    }

}

/*
https://www.hackerrank.com/challenges/java-arraylist/problem?h_r=next-challenge&h_v=zen
 */
