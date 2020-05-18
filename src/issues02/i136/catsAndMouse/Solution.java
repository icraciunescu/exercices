package issues02.i136.catsAndMouse;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int ca, cb;
        String result = null;

        if ((z - x) > 0) {
            ca = z - x;
        } else {
            ca = x - z;
        }
        if((z - y) > 0) {
            cb = z - y;
        } else {
            cb = y - z;
        }

        if (ca < cb) result = "Cat A";
        if (cb < ca) result = "Cat B";
        if (ca == cb) result = "Mouse C";

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\JavaTest\\Exercises\\src\\issues02\\i136\\catsAndMouse\\file.txt"));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}


/*
https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 */