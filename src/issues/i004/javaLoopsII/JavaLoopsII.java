package issues.i004.javaLoopsII;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        if (0<=t && t<=500) {
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                mySeries(a, b, n);
            }
        }
        in.close();

    }

    private static int sumTwoAtPowerN (int n) {
        int twoAtPower = 2;
        int sumTwoAtPower = 3;
        int sumTwoAtPowerN = 1;
        if (n == 0) {
            twoAtPower = 1;
            sumTwoAtPowerN = 1;
        }
        if (n == 1) {
            twoAtPower = 2;
            sumTwoAtPowerN = 1 + 2;
        }
        for (int i = 2; i <= n; i++) {
            twoAtPower = twoAtPower * 2;
            sumTwoAtPower = sumTwoAtPower + twoAtPower;
            if (i == n) {
                sumTwoAtPowerN = sumTwoAtPower;
            }
        }
        return sumTwoAtPowerN;
    }

    private static void mySeries(int a, int b, int n) {
        if (0<=a && a<=50 && 0<=b && b<=50 && 1<=n && n<=15) {
            for (int j = 0; j < n; j++) {
                int sj = a + b * sumTwoAtPowerN( j );
                System.out.printf(" %s", sj);
            }
        }
            // (a + 2p0 * b)(a + 2p0 * b + 2p1 * b) ... (a + 2p0 * b + 2p1 * b + . . . + 2pn-1 * b)
            // (a + 2p0 * b)[a + b(2p0 + 2p1)] ...
        }

    }

/*
https://www.hackerrank.com/challenges/java-loops/problem?h_r=next-challenge&h_v=zen
 */
