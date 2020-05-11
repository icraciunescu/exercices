package issues02.i125.aboutScope;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}

class Difference {
    private final int[] elements;
    public int maximumDifference;
    int test;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        for (int i = elements.length - 1; i >= 0 ; i--) {
            for (int j = elements.length - 1; j >= 0; j--) {
                if (elements[i] >= elements[j]) {
                    test = elements[i] - elements[j];
                } else {
                    test = elements[j] - elements[i];
                }
                if (maximumDifference < test) {
                    maximumDifference = test;
                }
            }
        }
    }


    // Add your code here

} // End of Difference class


/*
https://www.hackerrank.com/challenges/30-scope/problem
 */
