package issues02.i117.review;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        if (n >= 1 && n <= 10) {
            for (int i = 1; i <= n; i++) {
                String s = scanner.next();
                StringBuilder result1 = new StringBuilder();
                StringBuilder result2 = new StringBuilder();
                if(s.length() > 2) {
                    for (int j = 0; j < s.length(); j++) {
                        if (j % 2 == 0) {
                            result1.append(s.charAt(j));
                        } else {
                            result2.append(s.charAt(j));
                        }
                    }
                    System.out.println(result1 + " " + result2);
                }
            }
        }
    }

}
