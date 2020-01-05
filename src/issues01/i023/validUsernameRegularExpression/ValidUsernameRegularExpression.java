package issues01.i023.validUsernameRegularExpression;

import java.util.Scanner;

public class ValidUsernameRegularExpression {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

class UsernameValidator {
        public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
}

/*
https://www.hackerrank.com/challenges/valid-username-checker/problem

\^............... The beginning of a line
\$............... The end of a line
\w .............. A word character
\X{n,m}..... X, at least n but not more than m times
We need to place the \^ and \$ anchors at the beginning and ends of the String so that an invalid username with a valid username inside it doesn't get approved.
The extra backslash in \w is to "escape" the 2nd backslash character in a Java String.

 */
