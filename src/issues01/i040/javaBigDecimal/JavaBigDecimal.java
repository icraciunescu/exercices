package issues01.i040.javaBigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        String[] ss = new String[n];
        for (int i = 0; i < n; i++) {
            ss[i] = s[i];
        }
        Arrays.sort( ss, Collections.reverseOrder( new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal a = new BigDecimal( o1 );
                BigDecimal b = new BigDecimal( o2 );
                return a.compareTo( b );
            }
        } ) );

        for (int i = 0; i < n; i++) {
            s[i] = ss[i];
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}

/*
https://www.hackerrank.com/challenges/java-bigdecimal/problem
 */
