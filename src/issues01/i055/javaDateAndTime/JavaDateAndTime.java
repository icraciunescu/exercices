package issues01.i055.javaDateAndTime;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateAndTime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();

        System.out.println(Result.findDay( month, day, year ));

    }

}

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String result = LocalDate.of(year, month, day).getDayOfWeek().name();
        return result;

    }

}

/*
https://www.hackerrank.com/challenges/java-date-and-time/problem
 */
