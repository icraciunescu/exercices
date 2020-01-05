package issues01.i044.javaSubArray;

import java.util.Scanner;

public class JavaSubArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int count = 0;
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int k = j; k < n; k++) {
                sum = a[k] + sum;
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

}

/*
https://www.hackerrank.com/challenges/java-negative-subarray/problem
 */
