package issues.i046.javaList;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {

        int n, q;
        ArrayList<Integer> list;
        ArrayList<Integer> secondList;

        Scanner scanner = new Scanner( System.in );
        n = scanner.nextInt();
        list = new ArrayList<>( n );
        for (int i = 0; i < n; i++) {
            list.add( scanner.nextInt() );
        }

        q = scanner.nextInt();
        int count = 0;
        String query;
        secondList = new ArrayList<>();
        secondList.addAll( list );
        while (count < q) {
            query = scanner.next();
            if (query.equals( "Insert" )) {
                secondList.add( scanner.nextInt(), scanner.nextInt() );
            }
            if (query.equals( "Delete" )) {
                secondList.remove( scanner.nextInt() );
            }
            count++;
        }

        for (int j = 0; j < secondList.size(); j++) {
            System.out.print(secondList.get( j ) + " ");
        }

    }

}

/*
https://www.hackerrank.com/challenges/java-list/problem
 */
