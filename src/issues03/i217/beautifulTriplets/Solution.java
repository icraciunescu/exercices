package issues03.i217.beautifulTriplets;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr) {
        int result = 0;

        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int arrElem : arr) {
            if (integerMap.containsKey(arrElem)) {
                integerMap.put(arrElem, integerMap.get(arrElem) + 1);
            } else {
                integerMap.put(arrElem, 1);
            }
        }

        for (int var : integerMap.keySet()) {
            if (integerMap.containsKey(var + d)) {
                if (integerMap.containsKey(var + 2 * d)) {
                    result = result + integerMap.get(var) * integerMap.get(var + d) * integerMap.get(var + 2 * d);
                }
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\JavaTest\\Exercises\\src\\issues03\\i217\\beautifulTriplets\\file.txt"));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


/*
https://www.hackerrank.com/challenges/beautiful-triplets/problem
 */
