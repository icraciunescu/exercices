package issues02.i147.newYearChaos;

import java.util.Scanner;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int result = 0;
        boolean tooChaotic = false;

        for (int i = q.length - 1; i >=0 ; i--) {
            if (q[i] != (i + 1)) {
                if (q[i - 1] == (i + 1)) {
                    int temp = q[i];
                    q[i] = q[i - 1];
                    q[i - 1] = temp;
                    result++;
                } else if (q[i - 2] == (i + 1)) {
                    int temp = q[i - 1];
                    q[i - 1] = q[i - 2];
                    q[i - 2] = temp;
                    result++;
                    int temp2 = q[i];
                    q[i] = q[i - 1];
                    q[i - 1] = temp2;
                    result++;
                } else {
                   tooChaotic = true;
                    break;
                }
            }
        }

        if (tooChaotic) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(result);
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}



/*
https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */