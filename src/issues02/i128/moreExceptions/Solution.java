package issues02.i128.moreExceptions;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

class Calculator {

    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        double result = Math.pow(n, p);
        return intValue(result);
        //return Integer.parseInt(Double.valueOf(result).toString());
    }

    public int intValue(double value) {
        return (int)value;
    }

}


/*
https://www.hackerrank.com/challenges/30-more-exceptions/problem
 */
