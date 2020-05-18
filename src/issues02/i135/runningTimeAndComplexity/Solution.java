package issues02.i135.runningTimeAndComplexity;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();
        while (var-- != 0) {
            boolean isPrime = true;
            int num = scanner.nextInt();
            if (num != 1) {
                int sqrt = (int) Math.sqrt(num);
                for (int i = 2; i <= sqrt; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                isPrime = false;
            }

            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
        scanner.close();
    }

}
