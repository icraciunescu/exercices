package issues03.i219.migratoryBirds;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int result = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        Map<Integer, Integer> integerMap = new HashMap<>();
        Map<Integer, Integer> maxValMap = new HashMap<>();

        for (int arrElem : arr) {
            if (integerMap.containsKey(arrElem)) {
                integerMap.put(arrElem, integerMap.get(arrElem) + 1);
            } else {
                integerMap.put(arrElem, 1);
            }
        }

        Collection<Integer> integerCollection = integerMap.values();
        for (int val : integerCollection) {
            maxVal = Math.max(maxVal, val);
        }

        for (Map.Entry<Integer, Integer> val : integerMap.entrySet()) {
            if (val.getValue() == maxVal) {
                maxValMap.put(val.getKey(), val.getValue());
            }
        }

        for (int val : maxValMap.keySet()) {
            result = Math.min(result, val);
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\JavaTest\\Exercises\\src\\issues03\\i219\\migratoryBirds\\file.txt"));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}




/*
https://www.hackerrank.com/challenges/migratory-birds/problem
 */