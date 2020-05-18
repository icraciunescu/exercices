package issues02.i137.compareTheTriplets;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int m = 0;
        int n = 0;
        List<Integer> integerList = new LinkedList<>();
        for (int i = 0; i <= 2; i++) {
            if (!a.get(i).equals(b.get(i))) {
                if (a.get(i) > b.get(i)) {
                    m++;
                } else {
                    n++;
                }
            }
        }
        integerList.add(m);
        integerList.add(n);

        return integerList;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\JavaTest\\Exercises\\src\\issues02\\i137\\compareTheTriplets\\file.txt"));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}


/*
https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */
