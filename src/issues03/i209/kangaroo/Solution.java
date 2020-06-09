package issues03.i209.kangaroo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = "NO";
        boolean isTrue = false;

        if (x1 + v1 == x2 + v2) {
            isTrue = true;
        }
        if (x1 <= x2 && v1 <= v2 && (!(x1 + v1 == x2 + v2))) {
            isTrue = false;
        }
        if (x1 >= x2 && v1 >= v2 && (!(x1 == x2 && v1 == v2))) {
            isTrue = false;
        }
        if (x1 + v1 < x2 + v2) {
            for (int i = 1; i <= Integer.MAX_VALUE; i++) {
                if (x1 + v1 * i == x2 + v2 * i) {
                    isTrue = true;
                    break;
                }
                if (x1 + v1 * i > x2 + v2 * i) {
                    break;
                }
            }
        }
        if (x1 + v1 > x2 + v2) {
            for (int i = 1; i <= Integer.MAX_VALUE; i++) {
                if (x1 + v1 * i == x2 + v2 * i) {
                    isTrue = true;
                    break;
                }
                if (x1 + v1 * i < x2 + v2 * i) {
                    break;
                }
            }
        }

        if (isTrue) {
            result = "YES";
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\JavaTest\\Exercises\\src\\issues03\\i209\\kangaroo\\file.txt"));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


/*
https://www.hackerrank.com/challenges/kangaroo/problem
 */