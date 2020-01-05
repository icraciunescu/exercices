package issues01.i021.javaRegex;

import java.util.Scanner;

public class JavaRegex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }

}

class MyRegex{
    String zeroTo255 = "([\\d]{1,2}|(0|1)[\\d]{1,2}|(2)[0-4][\\d]|(25)[0-5])";
    public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
}

/*
Input (stdin)
Download
259.259.259.259
266.266.266.266
255.255.255.255
555.555.555.555
666.666.666.666
249.249.249.249
249.249.249.256
Expected Output
Download
false
false
true
false
false
true
false
 */

/*
1) \\d{1,2} catches any one or two digit number
2) (0|1)\\d{2} catches any three digit number starting with 0 or 1.
3) 2[0-4]\\d catches numbers between 200 and 249.
4) 25[0-5] catches numbers between 250 and 255.
Note that \d represents digits in regular expressions, same as [0-9]
Edit: Replaced "." with "\." as suggested in some of the comments

2[0-4] matches 20,21,22,23 and 24. Since \d represents digits, step 3 matches 200 to 249.
 */

/*
https://www.hackerrank.com/challenges/java-regex/problem
 */
