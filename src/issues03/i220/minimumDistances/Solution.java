package issues03.i220.minimumDistances;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
        int minDist = Integer.MAX_VALUE;
        Map<Integer, Integer> integerMap = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            if (integerMap.containsKey(a[i])) {
                int x = integerMap.get(a[i]);
                minDist = Math.min(minDist, i - x);
                integerMap.put(a[i], i);
            } else {
                integerMap.put(a[i], i);
            }
        }
        if (minDist == Integer.MAX_VALUE) {
            minDist = -1;
        }
        return minDist;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\JavaTest\\Exercises\\src\\issues03\\i220\\minimumDistances\\file.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
