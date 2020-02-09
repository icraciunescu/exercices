package issues02.i103.aboutFactorial;

import java.util.Scanner;

public class AboutFactorial {

    public static void main(String[] args) {

        int number;
        int charNumber;
        int factorialSum = 0;
        boolean isSum = false;
        String myNumber = "";

        Scanner scanner = new Scanner( System.in );
        number = scanner.nextInt();
        scanner.close();

        myNumber = myNumber + number;

        for (int i = 0; i <= myNumber.length() - 1; i++) {
            charNumber = Integer.parseInt( String.valueOf( myNumber.charAt( i ) ) );
            int factorialNumber = 1;
            for (int j = 1; j <= charNumber; j++) {
                factorialNumber = factorialNumber * j;
            }
            factorialSum = factorialSum + factorialNumber;
        }
        System.out.println(factorialSum);

        if (number == factorialSum) {
            isSum = true;
        }

        System.out.println(isSum);

    }

}
