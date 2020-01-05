package issues01.i006.sumXAtPowerN;

import java.util.Scanner;

public class sumXAtPowerN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        int xAtPower = x;
        int sumXAtPowerN = 1 + x;

        if (n == 0) {
            xAtPower = 1;
            sumXAtPowerN = 1;
            System.out.println(xAtPower);
            System.out.println(sumXAtPowerN);

        }

        if (n == 1) {
            xAtPower = x;
            sumXAtPowerN = 1 + x;
            System.out.println(xAtPower);
            System.out.println(sumXAtPowerN);
        }

        for (int i = 2; i <= n; i++) {
            xAtPower = xAtPower * x;
            sumXAtPowerN = sumXAtPowerN + xAtPower;

            if (i == n) {
                System.out.println( xAtPower );
                System.out.println(sumXAtPowerN);
            }
        }
    }
}
