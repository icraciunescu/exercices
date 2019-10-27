package issues.i005.xAtPowerN;

import java.util.Scanner;

public class xAtPowerN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        int xAtPower = x;

        if (n == 0) {
            xAtPower = 1;
            System.out.println(xAtPower);
        }

        if (n == 1) {
            xAtPower = x;
            System.out.println(xAtPower);
        }

        for (int i = 2; i <= n; i++) {
            xAtPower = xAtPower * x;
            if (i == n) {
                System.out.println( xAtPower );
            }
        }
    }
}

