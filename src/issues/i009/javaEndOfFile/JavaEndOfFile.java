package issues.i009.javaEndOfFile;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        String line;
        while (scanner.hasNext()) {
            i++;
            line = scanner.nextLine();
            System.out.println(i + " " + line);
        }
        scanner.close();
    }

}

/*
https://www.hackerrank.com/challenges/java-end-of-file/problem
 */