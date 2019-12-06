package issues.i001.javaStdinAndStdout;

import java.util.Scanner;

public class JavaStdinAndStdout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    /*
    https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
     */

}
