package issues02.i144.plusMinus;

import java.util.Scanner;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double a = 0;
        double b = 0;
        double c = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                a++;
            }
            if (arr[i] > 0) {
                b++;
            }
            if (arr[i] == 0) {
                c++;
            }
        }

        System.out.printf("%.6f %n", b/arr.length);
        System.out.printf("%.6f %n", a/arr.length);
        System.out.printf("%.6f %n", c/arr.length);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

