package issues.i012.javaDateAndTime;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateAndTime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        scanner.close();
        String dateForDay = "" + year + " " + month + " " + day;
        System.out.println(dateForDay);
        LocalDate localDate = LocalDate.of(year,month,day );
        System.out.println(localDate.getDayOfWeek());

    }

}

/*
https://www.hackerrank.com/challenges/java-date-and-time/problem?h_r=next-challenge&h_v=zen
 */
