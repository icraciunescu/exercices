package issues03.i206.timeConversion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String result;
        String hourModified = null;
        int hour;

        String a = s.substring(0, 2);
        String b = s.substring(2, 8);
        String c = s.substring(8);

        if (c.equals("PM")) {
            if (!a.equals("12")) {
                hour = Integer.parseInt(a);
                hour = hour + 12;
                hourModified = String.valueOf(hour);
            } else {
                hourModified = a;
            }
        } else if (c.equals("AM")) {
            if (a.equals("12")) {
                hourModified = "00";
            } else {
                hourModified = a;
            }
        }

        result = hourModified + b;

        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaTest\\Exercises\\src\\issues03\\i206\\timeConversion\\file.txt"));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}