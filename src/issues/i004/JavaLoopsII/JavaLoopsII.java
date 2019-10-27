package issues.i004.JavaLoopsII;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            mySeries(a, b, n);
            int twoAtPowerN = twoAtPowerN( n );
        }
        in.close();

    }

    private static int twoAtPowerN(int n) {

        int twoAtPower = 1;
        int twoAtPowerN = 0;
        for (int i = 1; i <= n; i++) {
            twoAtPower = twoAtPower * 2;
            if (i == n) {
                twoAtPowerN = twoAtPower;
            }
        }
        return twoAtPowerN;

    }

    private static void mySeries(int a, int b, int n) {
        for (int j = 0; j < n; j++) {
            int twoAtPower = 0;
            int twoAtPowerN = twoAtPower * 2;
            int m = 2 * 2;
        }
        System.out.println(a + 2^(n - 1) * b);

    }

}

/*
https://www.hackerrank.com/challenges/java-loops/problem?h_r=next-challenge&h_v=zen
 */